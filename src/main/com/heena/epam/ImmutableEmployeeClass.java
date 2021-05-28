package com.heena.epam;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmployeeClass {
    private final String name;
    private final Integer age;
    private final List<String> contacts;

    public ImmutableEmployeeClass(String name, Integer age, List<String> contacts) {
        this.name = name;
        this.age = age;
        this.contacts = new ArrayList<>(contacts);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getContacts() {
        return new ArrayList<>(contacts);
    }


}
