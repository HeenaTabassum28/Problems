package com.heena.enquerro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class CaseInsensitiveMapTest {

    @Test
    void verifyMapIsCaseInsensitive() {
        HashMap<Student, String> hashMap = new HashMap();
        Student wasim = new Student(1, "Wasim");
        Student small = new Student(1, "wasim");
        hashMap.put(small, "small");
        hashMap.put(wasim, "Caps");
        Assertions.assertEquals(1, hashMap.size());
        Assertions.assertEquals("Caps", hashMap.get(new Student(1, "WaSim")));
    }

}