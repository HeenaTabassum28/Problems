package com.heena.epam;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClassExample {
    public static void main(String[] args) {
        List<String> contactsList = new ArrayList<>();
        contactsList.add("1");
        contactsList.add("2");
        contactsList.add("4");
        ImmutableEmployeeClass immutableObj =
                new ImmutableEmployeeClass("Heena", 29, contactsList);
        List<String> contacts = immutableObj.getContacts();
        contacts.add("3");
        System.out.println(immutableObj.getContacts());
    }
}
