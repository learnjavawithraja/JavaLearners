package com.edu.controlstatements;

/**
 * This class is used to demonstrate the use of Looping in Java.
 */
public class LoopExample {

    static int age = 20;

    public static void main(String[] args) {

        // while, do-while, for

        int number = 1;
        while(number <= 10) {
            System.out.println(number);
            number = number + 1;
        }

        do {
            System.out.println(number);
            number = number + 1;
        } while (number <= 10);


        for(int value = 1; value < 5; value++) {
            //modulus = return remindar
            if(value % 2 == 0) {
                /*even number
                dagdshdf*/
            }

            if(value == 3) {
                continue;
            }

            System.out.println(value);
        }


    }
}
