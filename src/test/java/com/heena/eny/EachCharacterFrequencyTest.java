package com.heena.eny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class EachCharacterFrequencyTest {

    @Test
    void shouldReturnFrequencyOfEachCharacterInGivenString() {
        HashMap<Character, Integer> eachCharFrequency = EachCharacterFrequency.find("Missisippi");
        Assertions.assertEquals(1, eachCharFrequency.get('M'));
        Assertions.assertEquals(4, eachCharFrequency.get('i'));
        Assertions.assertEquals(3, eachCharFrequency.get('s'));
        Assertions.assertEquals(2, eachCharFrequency.get('p'));
    }


    @Test
    void verifyUsingJava8(){
       EachCharacterFrequency.findUsingJava8("Missisippi");
    }
}