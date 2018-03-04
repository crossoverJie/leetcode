package com.crossoverjie.leetcode.easy;

import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void deleteDuplicates() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
    }

}