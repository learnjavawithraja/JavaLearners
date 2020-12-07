package com.edu.oops.constructor;

public class SavingsAccount extends BankAccount {

    int age;

    public SavingsAccount(int accountNo, String name, double balance) {
        super(accountNo, name, balance);
        System.out.println("Child class constructor");
    }

    void deposit(double amount) {

        super.deposit(amount);

        balance = balance + 10;

        System.out.println("Child deposit done");
        printBalance();
    }
}
