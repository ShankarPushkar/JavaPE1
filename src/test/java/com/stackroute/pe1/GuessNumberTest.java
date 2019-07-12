package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessNumber;
    @Before
    public void setUp() throws Exception {
        guessNumber=new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        guessNumber=null;
    }

    @Test
    public void givenTwoInputShouldReturnLessThanOutput() {
        String actualResult=guessNumber.numberGuesser(10,2);
        assertEquals("Number guessed is less than original number",actualResult);
    }
    @Test
    public void givenTwoInputShouldReturnMoreThanOutput() {
        String actualResult=guessNumber.numberGuesser(10,20);
        assertEquals("Number guessed is more than original number",actualResult);
    }
    @Test
    public void givenTwoInputShouldReturnEqualOutput() {
        String actualResult=guessNumber.numberGuesser(10,10);
        assertEquals("You have guessed correctly",actualResult);
    }


}