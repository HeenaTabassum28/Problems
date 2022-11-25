package com.heena.harman;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] input = {16, 17, 4, 3, 5, 2};
        int size = input.length;
        int maxFromRight = input[size - 1];
        System.out.println(maxFromRight);
        for (int i = size - 2; i >= 0; i--) {
            if (maxFromRight <= input[i]) {
                maxFromRight = input[i];
                System.out.println(maxFromRight);
            }
        }
    }
}
