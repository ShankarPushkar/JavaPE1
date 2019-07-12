package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckTest {
    ConditionalCheck conditionalCheck;

    @Before
    public void setUp(){
        conditionalCheck=new ConditionalCheck();
    }


    @After
    public void tearDown() throws Exception {
        conditionalCheck=null;
    }

    @Test
    public void givenNumberShouldReturnOutput() {
        String actualResult=conditionalCheck.conditionChecker(0);
        assertEquals("The Number is not between 20 & 30",actualResult);
    }
    @Test
    public void givenEvenNumberBetweenTwentytoThirtyShouldReturnJerryOutput() {
        String actualResult=conditionalCheck.conditionChecker(22);
        assertEquals("Jerry",actualResult);
    }
    @Test
    public void givenOddNumberBetweenTwentytoThirtyShouldReturnTomOutput() {
        String actualResult=conditionalCheck.conditionChecker(23);
        assertEquals("Tom",actualResult);
    }

}