package com.heena.java8;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrimeUsingJava8(8));
    }

    private static boolean isPrimeUsingJava8(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
