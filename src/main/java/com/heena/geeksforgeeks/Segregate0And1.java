package com.heena.geeksforgeeks;

public class Segregate0And1 {
    public static void main(String[] args) {
        //int[] input = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int[] input = { 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
        int beginIndex = 0;
        int size = input.length;
        int endIndex = size - 1;
        while (beginIndex < endIndex) {
            if (input[beginIndex] == 1) {
                input[beginIndex] = input[beginIndex] + input[endIndex];
                input[endIndex] = input[beginIndex] - input[endIndex];
                input[beginIndex] = input[beginIndex] - input[endIndex];
                endIndex--;
            } else {
                beginIndex++;
            }
        }
        for (int a : input) {
            System.out.print(a + " ");

        }
    }
}
