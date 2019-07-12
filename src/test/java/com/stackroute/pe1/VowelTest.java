package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel vowel;

    @Before
    public void setUp() {
        vowel=new Vowel();
    }

    @After
    public void tearDown(){
        vowel=null;
    }

    @Test
    public void givenStringShouldReturnVowel() {
        String actualResult=vowel.vowelChecker("A");
        assertEquals("Vowel",actualResult);
    }
    @Test
    public void givenStringShouldReturnConsonant() {
        String actualResult=vowel.vowelChecker("B");
        assertEquals("Consonant",actualResult);
    }

}