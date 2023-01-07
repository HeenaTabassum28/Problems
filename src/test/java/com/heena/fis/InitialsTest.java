package com.heena.fis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class InitialsTest {

    @Test
    void shouldReturnListOfNamesByInitials() {
        HashMap<String, List<String>> namesByInitials = new HashMap<>(16);
        namesByInitials.put("A", Arrays.asList("Amar", "Ajay"));
        namesByInitials.put("G", Arrays.asList("Gaurav"));
        namesByInitials.put("D", Arrays.asList("Devendra", "Divit"));

        List<String> names = Initials.getNames(namesByInitials, Arrays.asList("D", "G"));
        Assertions.assertArrayEquals(new String[]{"Devendra", "Divit", "Gaurav"}, names.toArray());
    }

}