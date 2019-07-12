package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrimingTest {
    Triming triming;
    @Before
    public void setUp() {
        triming=new Triming();

    }

    @After
    public void tearDown(){
        triming=null;

    }

    @Test
    public void givenNullInputShouldReturnError() {
        String actualResult=triming.stringTrimmer(null,2);
        assertEquals("String Cannot be Null",actualResult);
    }
    @Test
    public void givenZeroInputShouldReturnError() {
        String actualResult=triming.stringTrimmer("Hello",0);
        assertEquals("Number cannot be Zero",actualResult);
    }
}