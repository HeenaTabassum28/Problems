package com.heena.allstate;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "a";
        printPermutations(str, "");
    }

    private static void printPermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0, i) + str.substring(i + 1);
            printPermutations(r, ans + ch);
        }
    }
}
