package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntergerSortTest {
    IntergerSort intergerSort;

    @Before
    public void setUp() {
        intergerSort=new IntergerSort();
    }

    @After
    public void tearDown(){
        intergerSort=null;
    }

    @Test
    public void givenNumberShouldReturnFalseOutput() {
        String actualResult=intergerSort.integerSorter(12345);
        assertEquals("False",actualResult);
    }
    @Test
    public void givenNumberShouldReturnTrueOutput() {
        String actualResult=intergerSort.integerSorter(1888888);
        assertEquals("True",actualResult);
    }
}