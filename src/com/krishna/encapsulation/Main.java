package com.krishna.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount A=new BankAccount();
        A.deposit(100);
        A.showBalance();
        A.withdraw(50);
        A.showBalance();
        BankAccount B=new BankAccount();

        B.withdraw(500);
        B.deposit(0);
    }
}
