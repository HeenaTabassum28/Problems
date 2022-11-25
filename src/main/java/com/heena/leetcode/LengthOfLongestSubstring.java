package com.heena.leetcode;

import java.util.Arrays;


/*3. Longest Substring Without Repeating Characters */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
        //System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            longestSubstringLength = Math.max(longestSubstringLength, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        System.out.println(Arrays.toString(index));
        return longestSubstringLength;
    }
}
