package com.heena.eny;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private final Integer id;
    private final String name;
    private final Date date;
    private final Map<String, String> hashmap;

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
