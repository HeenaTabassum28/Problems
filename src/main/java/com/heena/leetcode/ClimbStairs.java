package com.heena.leetcode;

public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(3));

    }

    public int climbStairs(int n) {
        if (n <= 1)
            return n;
        return n + climbStairs(n-1);
    }
}
