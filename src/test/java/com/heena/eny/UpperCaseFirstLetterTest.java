package com.heena.eny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFirstLetterTest {

    @Test
    void verifyFirstLetterOfEachWordInArrayIsUpperCase() {
        Assertions.assertArrayEquals(new String[]{"John", "Vicky", "Robbin", "James"}
                , UpperCaseFirstLetter.convert(new String[]{"john", "vicky", "robbin", "james"}));
    }

    @Test
    void verifyUsingJava8() {
        Assertions.assertArrayEquals(new String[]{"John", "Vicky", "Robbin", "James"}
                , UpperCaseFirstLetter.convertUsingJava8(new String[]{"john", "vicky", "robbin", "james"}));
    }

}