package com.edu.oops.constructor;

public class Employee extends Person {

    Employee(String name) {
        super();
        this.name = name;
    }


    public static void main(String[] args) {
        Employee e = new Employee("Test");
        System.out.println(e.name);
    }
}
