package com.heena.eny;

import org.junit.jupiter.api.Test;

class DuplicatesInArrayTest {

    @Test
    void shouldPrintDuplicates() {
        DuplicatesInArray.find(new int[]{5, 4, 3, 1, 3, 7, 2, 9, 9, 4}); // 4,3,9
    }

}