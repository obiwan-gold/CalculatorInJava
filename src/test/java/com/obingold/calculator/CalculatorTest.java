package com.obingold.calculator;

import com.obingold.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add two numbers")
    public void testAddition() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    @DisplayName("Subtract two numbers")
    public void subtract() {
        assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void multiply() {
       assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
    }
    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(5, 0), "Multiply by zero should be zero");
        assertEquals(0, calculator.multiply(0, 5), "Multiply by zero should be zero");
    }

    @Test
    @DisplayName("Divide two numbers")
    public void divide() {
        assertEquals(5, calculator.divide(20, 4), "Division should work");
    }
}