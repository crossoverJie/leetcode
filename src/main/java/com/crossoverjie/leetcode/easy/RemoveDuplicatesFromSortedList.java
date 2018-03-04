package com.crossoverjie.leetcode.easy;

/**
 * Function: 删除链表中重复的元素
 * <p>
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @author crossoverJie
 *         Date: 04/03/2018 23:47
 * @since JDK 1.8
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head;

        while (node.next != null) {
            //每次比较下一个是否和当前值相等
            if (node.val == node.next.val) {

                //相等就跳过当前值
                node.next = node.next.next;

            }else {

                node = node.next;
            }

        }


        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
