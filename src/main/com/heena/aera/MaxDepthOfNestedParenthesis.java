package com.heena.aera;

/*A string is a valid parentheses string (denoted VPS) if it meets one of the following:

        It is an empty string "", or a single character not equal to "(" or ")",
        It can be written as AB (A concatenated with B), where A and B are VPS's, or
        It can be written as (A), where A is a VPS.
        We can similarly define the nesting depth depth(S) of any VPS S as follows:

        depth("") = 0
        depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
        depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
        depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
        For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

        Given a VPS represented as string s, return the nesting depth of s.



        Example 1:

        Input: s = "(1+(2*3)+((8)/4))+1"
        Output: 3
        Explanation: Digit 8 is inside of 3 nested parentheses in the string.
        Example 2:

        Input: s = "(1)+((2))+(((3)))"
        Output: 3*/

/*Example 3:

        Input: s = "1+(2*3)/(2-1)"
        Output: 1
        Example 4:

        Input: s = "1"
        Output: 0*/


public class MaxDepthOfNestedParenthesis {
    public static void main(String[] args) {
        String input = "1";

        System.out.println("Depth of input string is :: " + maxDepth(input));
        System.out.println("Depth of input string is :: " + maxDepth(""));
        System.out.println("Depth of input string is :: " + maxDepth("1+(2*3)/(2-1)"));
        System.out.println("Depth of input string is :: " + maxDepth("(1)+((2))+(((3)))"));
        System.out.println("Depth of input string is :: " + maxDepth("(()"));


    }

    private static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                currentDepth++;
            }
            if (c == ')') {
                currentDepth--;
            }
            maxDepth = Math.max(currentDepth, maxDepth);

        }
        if (currentDepth != 0) {
            return -1;
        }
        return maxDepth;
    }
}
