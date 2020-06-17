package com.creational.bankaccount;

public class Worker implements Runnable{
    private BankAccount bankAccount;

    Worker(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++) {

            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }


            int startBalance = bankAccount.getBalance();
            synchronized (bankAccount){
                bankAccount.deposit(10);
            }
            int endBalance = bankAccount.getBalance();
            System.out.println("Start balance: "+startBalance+", deposit = 10, End balance: "+endBalance);
        }
    }
}
