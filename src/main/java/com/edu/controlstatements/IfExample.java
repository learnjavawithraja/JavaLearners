package com.edu.controlstatements;

public class IfExample {

    public static void main(String[] args) {

        int voterAge = 17;

        if(voterAge > 18) {
            System.out.println("Yes, you can vote");
        } else if(voterAge >= 17) {
            System.out.println("Yes can vote next time..");
        } else {
            System.out.println("No, you cannot vote now");
        }


    }

}
