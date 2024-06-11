package com.citi.service;

import com.citi.model.Stock;
import com.citi.model.StockType;
import com.citi.model.TradeAction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class SampleTest {

    @BeforeEach
    public void setUp() {

    }
    @Test
    public void testScenario1() {
        String expectedValue = 1;
        String actualValue = 1;
        Assertions.assertEquals(expectedValue, actualValue);
    }

}
