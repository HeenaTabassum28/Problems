package com.heena.leetcode;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        System.out.println(reverseWordsInAString.reverseWords("the sky   is blue"));
        System.out.println(reverseWordsInAString.reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        String trimmedString = s.trim();
        String[] split = trimmedString.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (!split[i].isBlank())
                reverse.append(split[i]).append(" ");
        }
        return reverse.toString().trim();
    }
}
