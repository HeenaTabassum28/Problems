package com.heena.java8;

import java.util.Comparator;
import java.util.List;

public class SquareOfMaxOdd {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(findSquareOfMaxOdd(integers));
    }

    private static int findSquareOfMaxOdd(List<Integer> numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
                max = i;
            }
        }
        return max * max;
    }

    public static int findSquareOfMaxOddUsingStream(List<Integer> numbers) {
        return numbers.stream()
                .filter(SquareOfMaxOdd::isOdd)        //Predicate is functional interface and
                .filter(SquareOfMaxOdd::isGreaterThan3)    // we are using lambdas to initialize it
                .filter(SquareOfMaxOdd::isLessThan11)    // rather than anonymous inner classes
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i) {
        return i > 3;
    }

    public static boolean isLessThan11(int i) {
        return i < 11;
    }
}
