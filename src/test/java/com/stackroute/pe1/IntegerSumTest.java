package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSumTest {
IntegerSum integerSum;
    @Before
    public void setUp() {
        integerSum=new IntegerSum();
    }

    @After
    public void tearDown() {
        integerSum=null;
    }

    @Test
    public void givenInputZeroShouldReturnZero() {
        int actualResult=integerSum.integerAdd(2,0);
        assertEquals(0,actualResult);
    }
    @Test
    public void givenInputShouldReturnSum() {
        int actualResult=integerSum.integerAdd(2,2);
        assertEquals(4,actualResult);
    }
}