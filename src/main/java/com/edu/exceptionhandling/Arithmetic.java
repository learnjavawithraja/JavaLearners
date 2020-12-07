package com.edu.exceptionhandling;

public class Arithmetic {

    void addPositive(int a, int b) throws NotAValidNumberException {

        if(a < 0 || b < 0) {
            throw new NotAValidNumberException();
        }

        System.out.println(a + b);
    }

    void add(int a, int b) throws NotAValidNumberException {
        addPositive(a, b);
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();

        try {
            arithmetic.add(10, 10);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Completed");
    }
}
