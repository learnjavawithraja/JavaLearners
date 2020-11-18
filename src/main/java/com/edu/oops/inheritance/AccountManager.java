package com.edu.oops.inheritance;

public class AccountManager {

    public static void main(String[] args) {
        SavingsAccount accountOne = new SavingsAccount();
        accountOne.accountNo = 1000;
        accountOne.name = "John";
        accountOne.balance = 1000.35;

        accountOne.deposit(2000);
        accountOne.withdraw(1000);
    }
}
