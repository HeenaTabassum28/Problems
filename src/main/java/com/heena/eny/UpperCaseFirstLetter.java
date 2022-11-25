package com.heena.eny;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UpperCaseFirstLetter {
    public static String[] convert(String[] input) {
        String[] output = new String[input.length];
        for (int i = 0, inputLength = input.length; i < inputLength; i++) {
            String inputWord = input[i];
            String firstLetter = inputWord.substring(0, 1);
            String upperCasedFirstLetter = firstLetter.toUpperCase();
            String outputWord = inputWord.replace(firstLetter, upperCasedFirstLetter);
            output[i] = outputWord;
        }
        return output;
    }
    public static String[] convertUsingJava8(String[] input) {
        return Arrays.stream(input).map(inputWord -> {
            String firstLetter = inputWord.substring(0, 1);
            String upperCasedFirstLetter = firstLetter.toUpperCase();
            return inputWord.replace(firstLetter, upperCasedFirstLetter);
        }).toArray(String[]::new);
    }
}
