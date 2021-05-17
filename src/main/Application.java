/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author OUSEC
 */
public class Application {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("--------Bienvenido a mi Calculadora-----------");
        System.out.println("hola");
        boolean runAgain = false;
        do{
            System.out.println("Que operacion desea realizar?");
            System.out.println(
            "1 - Suma \n"
            + "2 - Resta \n"
            + "3 - Multiplicacion \n"
            + "4 - Division \n"
            + "5 - Potencia \n"
            + "6 - Valor absoluto");
            String response = sc.nextLine();
            
            System.out.println("Ingrese el primer numero:");
            double num1 = sc.nextDouble();
            double num2 = 0;
            if (Integer.valueOf(response) < 6){
                System.out.println("Ingrese el segundo numero:");
                num2 = sc.nextDouble();
                sc.nextLine();
            }
            double result = 0;
            String operation = "";
            
            switch(response){
                case "1":
                    result = calc.sum(num1, num2);
                    operation = num1 + " + " + num2;
                    break;
                case "2":
                    result = calc.substraction(num1, num2); 
                    operation = num1 + " - " + num2;
                    break;
                case "3":
                    result = calc.multi(num1, num2);
                    operation = num1 + " * " + num2;
                    break;
                case "4":
                    result = calc.division(num1, num2);
                    operation = num1 + " / " + num2;
                    break;    
                case "5":
                    result = calc.pow(num1, num2);
                    operation = num1 + " ^ " + num2;
                    break;
                case "6":
                    result = Calculator.abs(num1);
                    operation = "Valor absoluto de "+ num1;
                    break;
                default:
                    System.out.println("Ingresaste una opcion invalida");
            }
            System.out.println("El resultado de la operacion "+ operation + " es "+result);
            System.out.println("Te gustaria hacer una nueva operacion? (s/n)");
            String wouldliketocontinue = sc.nextLine();
            runAgain = wouldliketocontinue.equalsIgnoreCase("s") ? true : false;
        } while(runAgain);
        System.out.println("Gracias por usar mi calculadora :");
        
    }
}