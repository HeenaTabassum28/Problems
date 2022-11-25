package com.heena.globant;

import java.util.*;
import java.util.stream.Collectors;

/*
Print numbers in descending order of their occurrence, if occurance is same then greater number should have high priority.
        Input : 9 1 9 4 9 4 1 3
        Output: 9 4 1 3
*/

public class PrintNumbersInDescendingOrderOfOccurence {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(9);
        input.add(1);
        input.add(9);
        input.add(4);
        input.add(9);
        input.add(4);
        input.add(1);
        input.add(3);

        Map<Integer, Integer> numberFrequency = new HashMap<>();

        for (Integer value : input) {
            numberFrequency.put(value, null == numberFrequency.get(value) ? 1 : numberFrequency.get(value) + 1);
        }
        System.out.println(numberFrequency);

        List<Integer> sortedValues = numberFrequency.values().stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(sortedValues);
        List<Integer> output = new ArrayList<>();
        sortedValues.forEach(integer -> {
            List<Integer> collect = numberFrequency.entrySet().stream()
                    .filter(obj -> obj.getValue().equals(integer))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            if(collect.size()==1){
                output.add(collect.get(0));
            }else {
                collect.sort(Collections.reverseOrder());
                output.addAll(collect);
            }
        });
        System.out.println(output);


    }
}
