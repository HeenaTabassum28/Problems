package com.heena.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        return trimmedString.length()- trimmedString.lastIndexOf(" ")-1;
    }
}
