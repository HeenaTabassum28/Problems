package com.heena.harman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WholeMinuteDilemma {
    public static void main(String[] args) {
        /*System.out.println(numPairsDivisibleBy60(List.of(30, 20, 150, 100, 40)));
        System.out.println(numPairsDivisibleBy60(List.of(10, 50, 90, 30)));
        System.out.println(numPairsDivisibleBy60(List.of(60, 60, 60)));*/

    }


    private static long numPairsDivisibleBy601(List<Integer> songs) {
        System.out.println(songs);
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < songs.size(); i++) {
            int remainder = songs.get(i) % 60;
            if (pairs.containsKey((60 - remainder) % 60)) {
                count += pairs.get((60 - remainder) % 60);
            }
            pairs.put(remainder, pairs.getOrDefault(remainder, 0) + 1);
        }
        System.out.println(count);
        return count;
    }

    private static long numPairsDivisibleBy60(List<Integer> songs) {
        System.out.println(songs);
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < songs.size(); i++) {
            int remainder = songs.get(i) % 60;
            if (remainder == 0) {
                count += pairs.getOrDefault(0, 0);
            } else {
                count += pairs.getOrDefault(60 - remainder, 0);
            }
            pairs.put(remainder, pairs.getOrDefault(remainder, 0) + 1);
        }
        System.out.println(count);
        return count;
    }

    private static long numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            int remainder = time[i] % 60;
            if (remainder == 0) {
                count += pairs.getOrDefault(0, 0);
            } else {
                count += pairs.getOrDefault(60 - remainder, 0);
            }
            pairs.put(remainder, pairs.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
