package com.heena.eny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.heena.eny.MaxEvenLengthWord.findMaxEvenLengthWord;
import static com.heena.eny.MaxEvenLengthWord.findMaxEvenLengthWordJava8;

class MaxEvenLengthWordTest {

    @Test
    void verify() {
        Assertions.assertEquals("afraid", findMaxEvenLengthWord("Be not afraid of greatness"));
        Assertions.assertEquals("Time", findMaxEvenLengthWord("Time to construct great art"));
        Assertions.assertEquals("afraid", findMaxEvenLengthWordJava8("Be not afraid of greatness"));
        Assertions.assertEquals("Time", findMaxEvenLengthWordJava8("Time to construct great art"));
    }

}