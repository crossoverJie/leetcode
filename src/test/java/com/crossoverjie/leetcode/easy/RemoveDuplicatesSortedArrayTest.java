package com.crossoverjie.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSortedArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        int[] nums = new int[]{1,2,2,3,4,5} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(5,i);
    }
    @Test
    public void removeDuplicates2() throws Exception {
        int[] nums = new int[]{2,2,2,3,4,5} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(4,i);
    }
    @Test
    public void removeDuplicates3() throws Exception {
        int[] nums = new int[]{2,2,2,3,5,6} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(4,i);
    }
    @Test
    public void removeDuplicates4() throws Exception {
        int[] nums = new int[]{2,2,2,3,5,5} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(3,i);
    }

    @Test
    public void removeDuplicates5() throws Exception {
        int[] nums = new int[]{3,5,5} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(2,i);
    }
    @Test
    public void removeDuplicates6() throws Exception {
        int[] nums = new int[]{1,1,2} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(2,i);
    }
    @Test
    public void removeDuplicates7() throws Exception {
        int[] nums = new int[]{1,1,1} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(1,i);
    }

    @Test
    public void removeDuplicates8() throws Exception {
        int[] nums = new int[]{1,1,1,2,2,3,3,4,4} ;
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(nums);

        Assert.assertEquals(4,i);
    }

    @Test
    public void removeDuplicates9() throws Exception {
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(null);

        Assert.assertEquals(0,i);
    }

    @Test
    public void removeDuplicates10() throws Exception {
        RemoveDuplicatesSortedArray array = new RemoveDuplicatesSortedArray() ;
        int i = array.removeDuplicates(new int[]{});

        Assert.assertEquals(0,i);
    }

}