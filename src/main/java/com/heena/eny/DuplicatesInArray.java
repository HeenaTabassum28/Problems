package com.heena.eny;

import java.util.HashSet;

public class DuplicatesInArray {
    public static void find(int[] input) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : input) {
            boolean addedToSet = uniqueNumbers.add(number);
            if (!addedToSet) {
                System.out.println(number + " is duplicate");
            }
        }
    }
}
