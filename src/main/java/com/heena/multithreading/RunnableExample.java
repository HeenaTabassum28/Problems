package com.heena.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {
    public static void main(String[] args) {
        int noOfCores = Runtime.getRuntime().availableProcessors();
        //ExecutorService service = Executors.newFixedThreadPool(100);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}
