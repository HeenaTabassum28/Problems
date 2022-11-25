package com.heena.java8;

@FunctionalInterface
interface EvenOdd {
    void test(int num);
}

public class EvenOddUsingLambda {
    public static void main(String[] args) {
        EvenOdd evenOdd = (int num) -> {
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };
        evenOdd.test(12);
    }
}
