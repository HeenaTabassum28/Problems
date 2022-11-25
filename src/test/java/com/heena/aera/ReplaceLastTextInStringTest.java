package com.heena.aera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceLastTextInStringTest {

    @Test
    void shouldReplaceLastTextWithGivenString() {
        Assertions.assertEquals("This is test string this is array used in app",
                ReplaceLastTextInString.replace("This is test string this is test string used in app", "test string", "array"));
    }

}