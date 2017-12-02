package com.crossoverjie.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {
    private TwoSum twoSum ;

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum() ;
    }

    /**
     * 单测
     * @throws Exception
     */
    @Test
    public void twoSum() throws Exception {
        int[] nums = {2, 7, 11, 15} ;
        int[] result = twoSum.twoSum(nums, 9) ;
        int[] target ={0,1} ;
        Assert.assertArrayEquals(result,target);
    }

}