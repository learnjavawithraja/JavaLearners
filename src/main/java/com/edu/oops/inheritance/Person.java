package com.edu.oops.inheritance;

public class Person {

    static boolean isHuman = true;
    Vehicle vehicle;

    public static void main(String[] args) {

        System.out.println(Person.isHuman);

        Vehicle pulsar = new Vehicle();
        pulsar.name = "Pulsar bike";
        pulsar.price = 100000;

        Person p = new Person(); //memory is allocation for all non-static members
        p.vehicle = pulsar;


        System.out.println(p.vehicle.name);
        System.out.println(p.vehicle.price);
        System.out.println(p.vehicle.getMaxSpeed());

    }



}
