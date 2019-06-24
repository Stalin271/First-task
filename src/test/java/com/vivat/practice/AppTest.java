package com.vivat.practice;

import static org.junit.Assert.assertEquals;

import com.vivat.practice.Bad_Value;
import org.junit.Test;
import sun.security.x509.X500Name;

public class AppTest {

    @Test
    public void StringProcessingGood() {
        assertEquals("HelloWorld" App.getInitials("Hello123 World"));
    }
    @Test(expected = Bad_Value.class)
    public void InputString() {
        App.getInitials("");
    }
}
