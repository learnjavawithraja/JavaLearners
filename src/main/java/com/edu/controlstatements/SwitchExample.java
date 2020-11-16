package com.edu.controlstatements;

public class SwitchExample {

    public static void main(String[] args) {

        int age = 2;

        switch (age) {

            case 1:
                System.out.println("New born");
                break;
            case 2:
                System.out.println("Infant");
                break;
            case 3:
                System.out.println("Kid");
                break;
            default:
                System.out.println("No match");

        }

    }
}
