package com.heena.eny;

import java.util.Arrays;
import java.util.Comparator;

public class MaxEvenLengthWord {

    public static String findMaxEvenLengthWord(String input) {
        String[] words = input.split(" ");
        int maxEvenWordLength = 0;
        String maxEvenLengthWord = words[0];
        for (String word : words) {
            int currLength = word.length();
            if (currLength % 2 == 0 && currLength > maxEvenWordLength) {
                maxEvenWordLength = currLength;
                maxEvenLengthWord = word;
            }
        }
        return maxEvenLengthWord;
    }

    public static String findMaxEvenLengthWordJava8(String input) {
        return Arrays.stream(input.split(" ")).filter(word -> word.length() % 2 == 0).max(Comparator.comparing(String::length)).orElse("No string found");
    }

}
