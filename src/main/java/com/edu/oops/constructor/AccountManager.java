package com.edu.oops.constructor;

public class AccountManager {

    public static void main(String[] args) {
        SavingsAccount accountOne = new SavingsAccount(1000, "John", 1000.35);

        accountOne.deposit(2000);
        accountOne.withdraw(1000);
    }
}
