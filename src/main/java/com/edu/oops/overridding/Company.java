package com.edu.oops.overridding;

public class Company {

    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        System.out.println("Assistant bonus date: " + assistant.getNextBonusDate());

        Manager manager = new Manager();
        System.out.println("Manager bonus date: " + manager.getNextBonusDate());
    }
}
