package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterClassificationTest {
    CharacterClassification characterClassification;
    @Before
    public void setUp() {
        this.characterClassification=new CharacterClassification();
    }

    @After
    public void tearDown(){
        this.characterClassification=null;
    }

    @Test
    public void GivenANumberShouldReturnMessage() {
        //act
        String actualResult=characterClassification.characterClassifier('1');
        //assert
        assertEquals("This is number",actualResult);
    }
    @Test
    public void GivenASymbolShouldReturnMessage() {
        //act
        String actualResult=characterClassification.characterClassifier('!');
        //assert
        assertEquals("Character is symbol",actualResult);
    }
}