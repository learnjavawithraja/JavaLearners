package com.edu.exceptionhandling;

import java.util.Scanner;


/**
 * try - monitor code for exception
 * catch - catches the exception from try block
 * throw - initiates an exception
 * throws - propagates exception to the calling method
 * finally - executes code irrespective of whether exception occurred or not
 */
public class Math {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result::" + result);
        } catch (Exception exception) {
            System.out.println("Caught exception");
        }

        System.out.println("Completed");
    }
}
