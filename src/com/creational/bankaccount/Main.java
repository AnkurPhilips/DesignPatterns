package com.creational.bankaccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = BankAccount.getInstance(100);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++) {
            Worker worker = new Worker(bankAccount);
            executorService.submit(worker);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println(bankAccount.getBalance());
    }
}
