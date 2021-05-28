package com.heena.harman;

/*Given an array of integers, replace every element with the next greatest element
        (greatest element on the right side) in the array. Since there is no element next to the last element, replace it with -1.
        For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.*/

//Optimized way would be iterating from the last element
public class ReplaceElementsWithNextGreatest {
    public static void main(String[] args) {
        int[] input = {16, 17, 4, 3, 5, 2};

       // twoLoopsWay(input);
        optimizedWay(input);
    }

    private static void optimizedWay(int[] input) {
        int size = input.length;
        int maxFromRight = input[size - 1];
        input[size - 1] = -1;
        for (int i = size - 2; i >= 0; i--) {
            int temp = input[i];
            input[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, temp);
        }
        printArray(input);
    }

    private static void twoLoopsWay(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                input[i] = -1;
            } else {
                int max = 0;
                for (int j = i + 1; j < input.length; j++) {
                    max = Math.max(max, input[j]);
                }
                input[i] = max;
            }
        }
        printArray(input);
    }

    private static void printArray(int[] input) {
        for (int j : input) {
            System.out.print(j + " ");
        }
    }
}
