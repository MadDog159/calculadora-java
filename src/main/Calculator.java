/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author OUSEC
 */
public class Calculator {
    
    long maxIntegers;

    /**
     *
     * @param num1 First number
     * @param num2 Second number
     * @return the sum of both numbers
     */

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double substraction(double num1, double num2){
        return num1 - num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double multi(double num1, double num2){
        return num1 * num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double division(double num1, double num2){
        return num1 / num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double pow(double num1, double num2){
        return Math.pow(num1, num2);
    }
    
    /**
     *
     * @param num1
     * @return
     */
    public static double abs(double num1){
        return num1 >= 0 ? num1 : num1 *  -1;
    }
    
    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double randomOperations(double num1, double num2){
        return Math.random() * sum(num1, num2);
    }
    
}
