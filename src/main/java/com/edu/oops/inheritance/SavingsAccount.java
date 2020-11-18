package com.edu.oops.inheritance;

public class SavingsAccount extends BankAccount {


    void deposit(double amount) {

        super.deposit(amount);

        balance = balance + 10;

        System.out.println("Child deposit done");
        printBalance();
    }
}
