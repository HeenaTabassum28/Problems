package com.heena.fis;

import java.util.*;
import java.util.stream.Collectors;

public class Initials {
    public static void main(String[] args) {
        //  Map having alphabet as key and list of names as value. Create a new master list having for few Initials:
        HashMap<String, List<String>> namesList = new HashMap<>(16);
        namesList.put("A", Arrays.asList("Amar", "Ajay"));
        namesList.put("G", Arrays.asList("Gaurav"));
        namesList.put("D", Arrays.asList("Devendra", "Divit"));

        System.out.println(getNames(namesList, Arrays.asList("D", "G")));

    }

    static List<String> getNames(HashMap<String, List<String>> namesList, List<String> initials){
        return namesList.entrySet().stream()
                .filter(stringListEntry -> initials.contains(stringListEntry.getKey()))
               // .map(Map.Entry::getValue)
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.toList());

    }
}
