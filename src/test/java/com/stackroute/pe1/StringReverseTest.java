package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setUp()  {
        stringReverse=new StringReverse();
    }

    @After
    public void tearDown() {
        stringReverse=null;
    }

    @Test
    public void givenStringShouldReturnReverse() {
        //act
        String actualResult=stringReverse.stringReverser("pushkar");
        //assert
        assertEquals("rakhsup",actualResult);
    }
}