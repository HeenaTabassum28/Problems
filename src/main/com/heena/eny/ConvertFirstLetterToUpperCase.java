package com.heena.eny;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertFirstLetterToUpperCase {
    public static void main(String[] args) {
        /*String[] array = {"john", "vicky", "robbin", "james"};
        String str = "Missisippi";
        conversion(array);
        findOccurenceOfEachCharacter(str);*/
        int[] arr = {5, 4, 3, 1, 3, 7, 2, 9, 9, 4};
        findDuplicatesInArray(arr);
       /* [4:13 PM] Neeraj 1

        Ex: Be not afraid of greatness
        Output: afraid
​[4:13 PM] Neeraj 1

        Be not afraid of greatness*/
        findMaxEvenLengthWord("Be not afraid of greatness");

    }

    private static String findMaxEvenLengthWord(String input) {

        return null;
    }

    private static void findDuplicatesInArray(int[] arr) {
        HashMap<Integer, Integer> intFrequency = new HashMap<>();
        Set<Integer> unique = new HashSet<>();
        /*for (int i = 0; i < arr.length; i++) {
            boolean isAdded = unique.add(arr[i]);
            if(!isAdded){
                System.out.println(isAdded);
            }

        }*/

        //Use filter
        Arrays.stream(arr).forEach(operand -> {
            boolean isAdded = unique.add(operand);
            if (!isAdded) {
                System.out.println(operand);
            }
        });
    }

    private static void findOccurenceOfEachCharacter(String input) {
        char[] chars = input.toCharArray();
        //Arrays.st


    }

    private static void conversion(String[] array) {
        List<String> converted = Arrays.stream(array).map(s -> {
            String firstLetter = s.substring(0, 1);
            String upperCase = firstLetter.toUpperCase();
            return s.replace(firstLetter, upperCase);
        }).collect(Collectors.toList());
        System.out.println(converted);
    }
}

final class Employee {
    private Integer id;
    private String name;
    private Date date;
    private Map<String, String> hashmap;

    public Employee(Integer id, String name, Date date, Map<String, String> hashmap) {
        this.id = id;
        this.name = name;
        this.date = new Date(date.getTime());
        HashMap<String, String> deepCopy = new HashMap<>();
        hashmap.forEach((s, s2) -> deepCopy.put(s, s2));
        this.hashmap = deepCopy;
    }

    public Map<String, String> getHashmap() {
        HashMap<String, String> deepCopy = new HashMap<>();
        this.hashmap.forEach((s, s2) -> deepCopy.put(s, s2));
        return deepCopy;
    }
}
