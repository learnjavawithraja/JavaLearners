package com.edu.oops.overridding;

import java.time.LocalDate;

public class Manager extends Employee {

    LocalDate getNextBonusDate() {
        return LocalDate.now().plusMonths(3);
    }

}
