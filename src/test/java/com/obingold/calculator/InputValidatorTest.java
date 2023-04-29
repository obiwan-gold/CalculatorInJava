package com.obingold.calculator;

import com.obingold.input.InputValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InputValidatorTest {

    InputValidator inputValidator;

    @BeforeEach
    public void setUp() {
        inputValidator = new InputValidator();
    }

    @Test
    @DisplayName("Input should not be blank")
    public void whenInputIsBlank(){
        assertTrue(inputValidator.isInputEmpty(""));
    }

    @Test
    @DisplayName("Input should be an integer")
    public void whenInputIsInteger() {
        assertTrue(inputValidator.isInputValidInteger("123"));
    }

    @Test
    @DisplayName("Non Integer input should return with a recalled message")
    public void whenInputIsNotInteger(){
        assertFalse(inputValidator.isInputValidInteger("abc"));
    }
}