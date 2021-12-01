package com.example.javafxmlassignment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InputTest {
    @Test
    public void TestEmail() {
        User u1 = new User("abc123@xyz.com", "pw");
        User u2 = new User("thisisnotanemail", "pw");
        assertTrue(u1.checkEmail());
        assertFalse(u2.checkEmail());
    }
    @Test
    public void TestLength() {
        User u1 = new User("sample", "thisislongenough");
        User u2 = new User("sample", "short");
        assertTrue(u1.checkLength());
        assertFalse(u2.checkLength());
    }
}
