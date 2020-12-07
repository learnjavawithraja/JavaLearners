package com.edu.oops.constructor;

public class Person {

    String name;
    int age;

    Person() {
        name = "Alien";
        age = -1;
    }

    Person(String name, int age) {
        this.name = name;
        if(this.age < 18) {
            System.out.println("You are not eligible to vote");
        } else {
            this.age = age;
        }
    }

}
