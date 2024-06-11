package com.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @BeforeEach
    public void setUp() {

    }
    @Test
    public void testScenario1() {
        String expectedValue = "abc";
        String actualValue = "abc";
        Assertions.assertEquals(expectedValue, actualValue);
    }

}
