package com.creational.bankaccount;

public class BankAccount {

    private static BankAccount instance = new BankAccount(0);

    public  int getBalance() {
        return balance;
    }

    public  void deposit(int amount) {
        this.balance += amount;
    }

    private int balance;

    private BankAccount(int balance)
    {
        this.balance = balance;
    }

    public static BankAccount getInstance(int amount){
        instance.balance = amount;
        return instance;
    }


}
