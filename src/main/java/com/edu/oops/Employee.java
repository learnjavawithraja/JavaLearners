package com.edu.oops;

public class Employee {

    String orgName;
    String name;

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "John";
        emp1.orgName = "Apple";

        Employee emp2 = new Employee();
        emp2.name = "George";
        emp2.orgName = "Apple";

        Employee emp3 = new Employee();
        emp3.name = "Tedd";
        emp3.orgName = "Google";

        emp1.printName();
        emp2.printName();
        emp3.printName();
    }

    void printName() { // actual method
        System.out.println(name + "-->" + orgName);
    }

}
