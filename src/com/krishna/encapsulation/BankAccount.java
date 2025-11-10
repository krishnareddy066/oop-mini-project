package com.krishna.encapsulation;

public class BankAccount {
    private int  balance;


    // removing the set balance method, because Because allowing setBalance() would bypass the rules of deposit and withdraw, breaking encapsulation and making the balance unreliable
    //That’s the core idea.
    //Balance must only change through controlled operations, not arbitrary assignment.
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("invalid deposit");
            return;
        }
        System.out.println("deposit successful");
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("insufficient balance");
            return;
        }
        System.out.println("withdraw successful");
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("the current balance is :"+ balance);
    }
}


