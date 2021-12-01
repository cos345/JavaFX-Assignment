package com.example.javafxmlassignment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InputTest {
    @Test
    public void TestEmail() {
        assertTrue(User.checkEmail("abc123@xyz.com"));
        assertFalse(User.checkEmail("thisisnotanemail"));
    }
}
