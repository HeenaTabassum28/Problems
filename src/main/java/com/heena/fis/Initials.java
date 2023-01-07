package com.heena.fis;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Initials {
    public static List<String> getNames(HashMap<String, List<String>> namesList, List<String> initials) {
        return namesList.entrySet().stream()
                .filter(stringListEntry -> initials.contains(stringListEntry.getKey()))
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.toList());

    }
}
