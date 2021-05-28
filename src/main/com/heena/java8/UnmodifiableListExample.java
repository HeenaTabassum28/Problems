package com.heena.java8;

import java.util.*;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        List<int[]> ints1 = Arrays.asList(ints);
       /* List<Integer> immutableList = List.of(1, 2, 3);
        immutableList.add(5);*/
       // System.out.println(immutableList);
        List<String> list =new ArrayList<>();
        list.add("Heloow");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        list.add("sdsad");
        System.out.println(unmodifiableList);
        Optional<String> optional = Optional.of("Asdsa");
        Optional<Object> empty = Optional.empty();
        Optional<String> asdsad = Optional.ofNullable("asdsad");
        String[] array = list.toArray(String[]::new);
        String[] strings = list.toArray(String[]::new);
        String str = "  abc  def \t\t ";
        String trim = str.trim();
        System.out.println("***"+trim+"***");

        String strip = str.strip();
        System.out.println("***"+strip+"***");
    }
}
