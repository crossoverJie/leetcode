package com.crossoverjie.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;



public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void deleteDuplicates() throws Exception {
        RemoveDuplicatesFromSortedList.ListNode listNode1 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        RemoveDuplicatesFromSortedList.ListNode listNode2 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        RemoveDuplicatesFromSortedList.ListNode listNode3 = new RemoveDuplicatesFromSortedList.ListNode(2) ;
        RemoveDuplicatesFromSortedList.ListNode listNode4 = new RemoveDuplicatesFromSortedList.ListNode(3) ;
        RemoveDuplicatesFromSortedList.ListNode listNode5 = new RemoveDuplicatesFromSortedList.ListNode(3) ;

        listNode1.next = listNode2 ;
        listNode2.next = listNode3 ;
        listNode3.next = listNode4 ;
        listNode4.next = listNode5 ;

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList() ;
        RemoveDuplicatesFromSortedList.ListNode listNode = list.deleteDuplicates(listNode1);
        listNode1.next = listNode3 ;
        listNode3.next = listNode5 ;

        Assert.assertTrue(listNode1 == listNode);


    }

    @Test
    public void deleteDuplicates2() throws Exception {
        RemoveDuplicatesFromSortedList.ListNode listNode1 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        RemoveDuplicatesFromSortedList.ListNode listNode2 = new RemoveDuplicatesFromSortedList.ListNode(2) ;
        listNode1.next = listNode2 ;

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList() ;
        RemoveDuplicatesFromSortedList.ListNode listNode = list.deleteDuplicates(listNode1);
        Assert.assertTrue(listNode1 == listNode);


    }

    @Test
    public void deleteDuplicates3() throws Exception {
        RemoveDuplicatesFromSortedList.ListNode listNode1 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        RemoveDuplicatesFromSortedList.ListNode listNode2 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        RemoveDuplicatesFromSortedList.ListNode listNode3 = new RemoveDuplicatesFromSortedList.ListNode(1) ;
        listNode1.next = listNode2 ;
        listNode2.next = listNode3 ;

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList() ;
        RemoveDuplicatesFromSortedList.ListNode listNode = list.deleteDuplicates(listNode1);


        Assert.assertTrue(listNode1 == listNode);


    }
    @Test
    public void deleteDuplicates4() throws Exception {
        RemoveDuplicatesFromSortedList.ListNode listNode1 = null ;

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList() ;
        RemoveDuplicatesFromSortedList.ListNode listNode = list.deleteDuplicates(listNode1);


        Assert.assertTrue(listNode1 == listNode);


    }
    @Test
    public void deleteDuplicates5() throws Exception {
        RemoveDuplicatesFromSortedList.ListNode listNode1 = new RemoveDuplicatesFromSortedList.ListNode(1);
        listNode1.next = null ;

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList() ;
        RemoveDuplicatesFromSortedList.ListNode listNode = list.deleteDuplicates(listNode1);


        Assert.assertTrue(listNode1 == listNode);


    }

}