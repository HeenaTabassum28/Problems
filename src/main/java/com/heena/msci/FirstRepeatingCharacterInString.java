package com.heena.msci;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatingCharacterInString {
    public static void main(String[] args) {
        String input = "google";
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> charFrequency = new LinkedHashMap<>();
        for (Character ch : chars) {
            if (charFrequency.containsKey(ch)) {
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            } else {
                charFrequency.put(ch, 1);
            }
        }

        Character firstRepeatingCharacter = charFrequency.entrySet().stream().filter(o -> o.getValue() > 1).findFirst().get().getKey();
        System.out.println(firstRepeatingCharacter);
    }
}
