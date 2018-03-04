package com.crossoverjie.leetcode.easy;

/**
 * Function: 删除链表中重复的元素
 *
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @author crossoverJie
 *         Date: 04/03/2018 23:47
 * @since JDK 1.8
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        return head ;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
