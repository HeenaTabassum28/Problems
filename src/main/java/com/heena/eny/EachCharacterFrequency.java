package com.heena.eny;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EachCharacterFrequency {

    public static HashMap<Character, Integer> find(String input) {
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> eachCharFrequency = new HashMap<>();
        for (char ch : chars) {
            eachCharFrequency.put(ch, eachCharFrequency.getOrDefault(ch, 0) + 1);
        }
        return eachCharFrequency;
    }

    public static Map<Character, Long> findUsingJava8(String input) {
        return input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
