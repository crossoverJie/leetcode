package com.crossoverjie.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber ;
    @Before
    public void setUp() throws Exception {
        palindromeNumber = new PalindromeNumber() ;
    }

    @Test
    public void isPalindrome() throws Exception {
        boolean palindrome = palindromeNumber.isPalindrome(11211);
        Assert.assertEquals(palindrome,true) ;
    }

    @Test
    public void isPalindrome2() throws Exception {
        boolean palindrome = palindromeNumber.isPalindrome(-11211);
        Assert.assertEquals(palindrome,false) ;
    }

    @Test
    public void isPalindrome3() throws Exception {
        boolean palindrome = palindromeNumber.isPalindrome(11213);
        Assert.assertEquals(palindrome,false) ;
    }

}