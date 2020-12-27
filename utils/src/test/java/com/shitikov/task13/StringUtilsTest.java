package com.shitikov.task13;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
    }

    @Test
    void isPositiveNumberTestValid() throws NotNumberException {
        assertTrue(utils.isPositiveNumber("5"));
    }

    @Test
    void isPositiveNumberTestInvalid() throws NotNumberException {
        assertFalse(utils.isPositiveNumber("-5"));
    }

    @Test
    void isPositiveNumberTestException() {
        Exception exception = assertThrows(NotNumberException.class, () ->
                utils.isPositiveNumber("Ssdse"));
        assertEquals("This string isn't number", exception.getMessage());
    }
}