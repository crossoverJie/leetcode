package com.crossoverjie.leetcode.easy;

import com.crossoverjie.leetcode.easy.ReverseInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger() ;

    @Before
    public void setUp() throws Exception {
        reverseInteger = new ReverseInteger() ;
    }

    @Test
    public void reverse() throws Exception {
        int reverse = reverseInteger.reverse(9000);
        Assert.assertEquals(reverse,9);
    }


    @Test
    public void reverse2() throws Exception {
        int reverse = reverseInteger.reverse(1123456789);
        Assert.assertEquals(reverse,0);
    }

    @Test
    public void reverse3() throws Exception {
        int reverse = reverseInteger.reverse(-1123456789);
        Assert.assertEquals(reverse,0);
    }

    @Test
    public void reverse4() throws Exception {
        int reverse = reverseInteger.reverse(9834);
        Assert.assertEquals(reverse,4389);
    }

}