package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void testAddition() {
        Main main = new Main();

        int result = main.add(10, 20);

        assertEquals(30, result);
    }
}