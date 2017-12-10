package com.crossoverjie.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists mergeTwoSortedLists ;
    @Before
    public void setUp() throws Exception {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void mergeTwoLists() throws Exception {
        ListNode l1 = new ListNode(1) ;
        ListNode l1_2 = new ListNode(4);
        l1.next = l1_2 ;
        ListNode l1_3 = new ListNode(5) ;
        l1_2.next = l1_3 ;

        ListNode l2 = new ListNode(1) ;
        ListNode l2_2 = new ListNode(3) ;
        l2.next = l2_2 ;
        ListNode l2_3 = new ListNode(6) ;
        l2_2.next = l2_3 ;
        ListNode l2_4 = new ListNode(9) ;
        l2_3.next = l2_4 ;
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(l1, l2);

        System.out.println(listNode.toString());


    }

    @Test
    public void mergeTwoLists2() throws Exception {

        ListNode l2 = new ListNode(1) ;
        ListNode l2_2 = new ListNode(3) ;
        l2.next = l2_2 ;
        ListNode l2_3 = new ListNode(6) ;
        l2_2.next = l2_3 ;
        ListNode l2_4 = new ListNode(9) ;
        l2_3.next = l2_4 ;
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(null, l2);

        System.out.println(listNode.toString());


    }

}