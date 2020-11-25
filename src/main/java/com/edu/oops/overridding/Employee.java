package com.edu.oops.overridding;

import java.time.LocalDate;

public class Employee {

    int id;
    String name;
    double salary;

    LocalDate getNextBonusDate() {
        return LocalDate.now().plusMonths(6);
    }

}
