package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAPatternTest {

    private Calculator calculator;

    // Setup method: runs before every test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    // Teardown method: runs after every test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object removed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int firstNumber = 10;
        int secondNumber = 20;

        // Act
        int result = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int firstNumber = 20;
        int secondNumber = 10;

        // Act
        int result = calculator.subtract(firstNumber, secondNumber);

        // Assert
        assertEquals(10, result);
    }
}