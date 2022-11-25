package com.heena.aera;

public class ReplaceLastTextInString {


    public static String replace(String input, String toBeReplaced, String toBeReplaceWith) {
        int index = input.lastIndexOf(toBeReplaced);
        String substring = input.substring(index);
        String replace = substring.replace(toBeReplaced, toBeReplaceWith);
        String start = input.substring(0, index);
        return start.concat(replace);
    }
}
