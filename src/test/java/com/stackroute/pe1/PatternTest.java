package com.stackroute.pe1;

import org.junit.After;
import org.junit.Assert;
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
        System.out.println("Inside After");
        this.pattern= null;
    }

    @Test
    public void givenAInputShouldReturnPatern() {
        //act
        int checker[] = {1,2,2};

        int[] actualResult=pattern.patternBuider(2);
        //assert
        Assert.assertArrayEquals(checker,actualResult);

    }
    @Test
    public void givenZeroShouldReturnZero() {
        //act
        int[] checker=new int[10];
        int[] actualResult=pattern.patternBuider(0);
        //assert
        assertArrayEquals(checker,actualResult);

    }
}