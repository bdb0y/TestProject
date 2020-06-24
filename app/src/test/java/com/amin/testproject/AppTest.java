package com.amin.testproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    void shouldReturnFactorial() {
        assertEquals(0, Factorial.factorial(0));
    }
}
