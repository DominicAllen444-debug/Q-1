package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void addsPositiveNumbers() {
        assertEquals(30, new App().add(10, 20));
    }

    @Test
    void addsNegativeAndPositiveNumbers() {
        assertEquals(2, new App().add(-3, 5));
    }
}
