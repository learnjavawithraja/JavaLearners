package com.edu.staticexample;

public class Student {

    String name;
    int id;

    public static void main(String[] args) {
        System.out.println(School.name);
        School.printCourses();
        System.out.println(School.getTopCourse());
    }
}
