package com.heena.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"froyo");
        map.put(2,"abby");
        map.put(3,"denver");
        map.put(4,"frost");
        map.put(4,"frosty");
        map.put(5,"daisy");
        Map<Integer, String> sortedByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1,o2)->o2, LinkedHashMap::new));
        LinkedHashMap<Integer, String> collect = map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o2, LinkedHashMap::new));
        System.out.println(collect);
        //System.out.println(sortedByValue);
    }
}
