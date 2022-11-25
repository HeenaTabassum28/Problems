package com.heena.leetcode;

public class LongestValidParentheses {
    public static void main(String[] args) {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        /*System.out.println(longestValidParentheses.longestValidParentheses("(()"));
        System.out.println(longestValidParentheses.longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses.longestValidParentheses(""));*/
      //  System.out.println(longestValidParentheses.longestValidParentheses("()"));
        System.out.println(longestValidParentheses.longestValidParentheses("()(())"));
    }

    public int longestValidParentheses(String s) {
        int inputLength = s.length();
        s = s.replace("()","");
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = s.indexOf("()", index);
            if (index != -1) {
                index = index + 1;
                count = count + 2;
            }
        }
        return count;
    }
}
