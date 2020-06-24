package com.amin.testproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void shouldReturnFactorial() {
        assertEquals(0, Factorial.factorial(0));
        assertEquals(24, Factorial.factorial(4));
    }
}
