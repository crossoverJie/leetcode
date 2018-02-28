package com.crossoverjie.leetcode.medium;

import org.junit.Test;
import static com.crossoverjie.leetcode.medium.RemoveNthNodeFromEndOfList.ListNode ;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd() throws Exception {
        ListNode listNode1 = new ListNode(1) ;
        ListNode listNode2 = new ListNode(2) ;
        ListNode listNode3 = new ListNode(3) ;
        ListNode listNode4 = new ListNode(4) ;
        ListNode listNode5 = new ListNode(5) ;
        listNode1.next = listNode2 ;
        listNode2.next = listNode3 ;
        listNode3.next = listNode4 ;
        listNode4.next = listNode5 ;

        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList() ;
        removeNthNodeFromEndOfList.removeNthFromEnd(listNode1,2) ;

    }

    @Test
    public void removeNthFromEnd2() throws Exception {
        ListNode listNode1 = new ListNode(1) ;
        ListNode listNode2 = new ListNode(2) ;
        ListNode listNode3 = new ListNode(3) ;
        ListNode listNode4 = new ListNode(4) ;
        ListNode listNode5 = new ListNode(5) ;
        listNode1.next = listNode2 ;
        listNode2.next = listNode3 ;
        listNode3.next = listNode4 ;
        listNode4.next = listNode5 ;

        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList() ;
        removeNthNodeFromEndOfList.removeNthFromEnd(listNode1,5) ;

    }

    @Test
    public void removeNthFromEnd3() throws Exception {
        ListNode listNode1 = new ListNode(1) ;


        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList() ;
        removeNthNodeFromEndOfList.removeNthFromEnd(listNode1,1) ;

    }

}