package com.crossoverjie.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {
    @Test
    public void searchInsert() throws Exception {

        int[] nums ={1,3,5,6};
        int target = 5 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,2);
    }


    @Test
    public void searchInsert2() throws Exception {

        int[] nums ={1,3,5,6};
        int target = 2 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,1);
    }

    @Test
    public void searchInsert3() throws Exception {

        int[] nums ={1,3,5,6};
        int target = 7 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,4);
    }
    @Test
    public void searchInsert4() throws Exception {

        int[] nums ={1,3,5,6};
        int target = 0 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,0);
    }


    @Test
    public void searchInsert5() throws Exception {

        int[] nums =null;
        int target = 0 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,-1);
    }

    @Test
    public void searchInsert6() throws Exception {

        int[] nums ={};
        int target = 0 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,-1);
    }
    @Test
    public void searchInsert7() throws Exception {

        int[] nums ={1};
        int target = 1 ;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition() ;
        int index = searchInsertPosition.searchInsert(nums, target);
        Assert.assertEquals(index,0);
    }

}