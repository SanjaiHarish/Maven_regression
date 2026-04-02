package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    void testAddition() {
        int result = App.add(2, 3);
        assertEquals(5, result);
    }
}
