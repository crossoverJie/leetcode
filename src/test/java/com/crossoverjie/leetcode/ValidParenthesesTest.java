package com.crossoverjie.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

    ValidParentheses validParentheses ;

    @Before
    public void setUp() throws Exception {
        validParentheses = new ValidParentheses() ;
    }

    @Test
    public void isValid() throws Exception {
        boolean valid = validParentheses.isValid("[]}");
        Assert.assertEquals(valid,false);
    }


    @Test
    public void isValid2() throws Exception {
        boolean valid = validParentheses.isValid("[](}");
        Assert.assertEquals(valid,false);
    }

    @Test
    public void isValid3() throws Exception {
        boolean valid = validParentheses.isValid("[]()");
        Assert.assertEquals(valid,true);
    }

    @Test
    public void isValid4() throws Exception {
        boolean valid = validParentheses.isValid("{}");
        Assert.assertEquals(valid,true);
    }
    @Test
    public void isValid5() throws Exception {
        boolean valid = validParentheses.isValid("[]");
        Assert.assertEquals(valid,true);
    }
    @Test
    public void isValid6() throws Exception {
        boolean valid = validParentheses.isValid("()");
        Assert.assertEquals(valid,true);
    }

}