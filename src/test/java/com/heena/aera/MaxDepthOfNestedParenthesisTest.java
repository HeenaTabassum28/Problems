package com.heena.aera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.heena.aera.MaxDepthOfNestedParenthesis.maxDepth;

class MaxDepthOfNestedParenthesisTest {

    @Test
    void shouldReturnMaxNestedParenthesis() {
        Assertions.assertEquals(0, maxDepth("1"));
        Assertions.assertEquals(0, maxDepth(""));
        Assertions.assertEquals(1, maxDepth("1+(2*3)/(2-1)"));
        Assertions.assertEquals(-1, maxDepth("(()"));
        Assertions.assertEquals(3, maxDepth("(1+(2*3)+((8)/4))+1"));
        Assertions.assertEquals(3, maxDepth("(1)+((2))+(((3)))"));
    }

}