package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern pattern;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.pattern= new Pattern();
    }

    @After
    public void tearDown(){
        //arrange
        System.out.println("Inside Before");
        this.pattern= null;
    }

//    @Test
//    public void givenAInputShouldReturnPatern() {
//        //act
//        int actualResult=pattern.patternBuider(2);
//        //assert
//        assertEquals(122,actualResult);
//
//    }
    @Test
    public void givenZeroShouldReturnZero() {
        //act
        int actualResult=pattern.patternBuider(0);
        //assert
        assertEquals(0,actualResult);

    }
}