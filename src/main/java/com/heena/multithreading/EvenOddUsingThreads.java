package com.heena.multithreading;

public class EvenOddUsingThreads {
    int counter = 1;
    static int n;

    public static void main(String[] args) {
        n = 10;
        EvenOddUsingThreads evenOddUsingThreads = new EvenOddUsingThreads();
        Thread t1 = new Thread(evenOddUsingThreads::printEven);
        Thread t2 = new Thread(evenOddUsingThreads::printOdd);
        t1.start();
        t2.start();
    }

    private void printOdd() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    private void printEven() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }
}
