package com.heena.leetcode;

import java.util.List;

public class WholeMinuteDilemma {
    public static void main(String[] args) {

    }

    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        int[] countArray = new int[60];
        for(int t: time) countArray[t%60]++;

        result += (countArray[0]*(countArray[0]-1))/2;   //Possible Combination nC2 ==>n*(n-1)/2
        result += (countArray[30]*(countArray[30]-1))/2; //Possible Combination nC2 ==>n*(n-1)/2
        for(int i =1; i < 30;i++) result += countArray[i]*countArray[60-i];

        return result;
    }

    public int numPairsDivisibleBy60(List<Integer> songs) {
        System.out.println(songs.size());
        int result = 0;
        int[] countArray = new int[60];
        for(int t: songs) countArray[t%60]++;

        result += (countArray[0]*(countArray[0]-1))/2;   //Possible Combination nC2 ==>n*(n-1)/2
        result += (countArray[30]*(countArray[30]-1))/2; //Possible Combination nC2 ==>n*(n-1)/2
        for(int i =1; i < 30;i++) result += countArray[i]*countArray[60-i];

        return result;
    }
}
