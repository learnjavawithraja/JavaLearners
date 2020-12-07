package com.edu.oops.overridding;

import java.time.LocalDate;

public class Manager extends Employee {

    @Override //annotation - meta information
    LocalDate getNextBonusDate() {

        LocalDate employeeBonusDate = super.getNextBonusDate();
        LocalDate managerBonusDate = LocalDate.now().plusMonths(3);

        System.out.println("Emp bonus::" + employeeBonusDate + ", Manager bonus:: " + managerBonusDate);

        return managerBonusDate;
    }

}
