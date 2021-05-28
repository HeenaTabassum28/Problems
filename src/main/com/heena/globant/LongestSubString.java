package com.heena.globant;

/*Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

/*Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubString {
    public static void main(String[] args) {
        //String input = "abcabcbb";
       // String input = "b";
       // String input = "abcabcdef";
        String input = "pwwkew";

        List<Character> longestSubString = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            int skip = 0;
            Character c = input.charAt(i);
            if(longestSubString.contains(c)){
                skip++;
            }
            if(!longestSubString.contains(c)){
                longestSubString.add(c);
            }
        }
        String collect = longestSubString.stream().map(Object::toString).collect(Collectors.joining(""));
        System.out.println(collect);
    }
}
