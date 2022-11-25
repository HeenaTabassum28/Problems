package com.heena.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfCores = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(100);
        // ExecutorService service = Executors.newCachedThreadPool();
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = service.submit(new CallableTask());
            futures.add(future);
        }

        for (int i = 0; i < 100; i++) {
            Future<Integer> future = futures.get(i);
            System.out.println("Result of future #"+i+"="+future.get());
        }

        //perform unrelated operations
        //Integer result = future.get(); //blocking operation
       // System.out.println("Result :: " + result);

        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}

class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}
