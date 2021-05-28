package com.heena.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
       // System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
    }

    public Integer reverse(int x) {

        long reverseNum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            if(reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return Math.toIntExact(reverseNum);
    }
}
