package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @Test
    public void GivesNumberShouldReturnSumIsLessPalindrome() {
        String actualResult=palindrome.palindromeChecker(12321);
        assertEquals("The Number is Palindrome and the sum is less than 25",actualResult);
    }

    @Test
    public void GivesNumberShouldReturnSumIsMorePalindrome() {
        String actualResult=palindrome.palindromeChecker(2468642);
        assertEquals("The Number is Palindrome and the sum is more than 25",actualResult);
    }
    @Test
    public void GivesNumberShouldReturnNotPalindrome() {
        String actualResult=palindrome.palindromeChecker(2418642);
        assertEquals("The Number is not a palindrome",actualResult);
    }

}