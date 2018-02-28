package com.crossoverjie.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static com.crossoverjie.leetcode.medium.RemoveNthNodeFromEndOfList.ListNode;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 2);

        listNode3.next = listNode5;
        Assert.assertTrue(listNode == listNode1);

    }

    @Test
    public void removeNthFromEnd2() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 5);
        listNode1 = listNode1.next;
        Assert.assertTrue(listNode == listNode1);

    }

    @Test
    public void removeNthFromEnd3() throws Exception {
        ListNode listNode1 = null;


        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 1);
        Assert.assertTrue(listNode == null);

    }

    @Test
    public void removeNthFromEnd4() throws Exception {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = null ;


        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 1);
        Assert.assertTrue(listNode == null);

    }

}