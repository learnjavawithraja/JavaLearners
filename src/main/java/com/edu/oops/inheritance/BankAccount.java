package com.edu.oops.inheritance;

public class BankAccount {

    //attributes or properties
    int accountNo;
    String name;
    double balance;


    void printFullName(String name) {
        System.out.println(this.name + name);
    }

    //behaviors
    void deposit(double amount) {
        balance = balance + amount;

        System.out.println("Deposited parent amount: " + amount);
        printBalance();
    }

    //method overloading
    void deposit(double amount, double bonus) {
        balance = balance + amount + bonus;

        System.out.println("Deposited amount: " + amount);
        printBalance();
    }

    void withdraw(double amount) {
        balance = balance - amount;

        System.out.println("Withdraw amount: " + amount);
        printBalance();
    }

    void printBalance() {
        System.out.println("Current balance: "+ balance);
    }
}
