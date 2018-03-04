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
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null){
            return head ;
        }
        while (head != null){
            if (head.val == head.next.val){

                if (head.next.next == null){
                    head.next = null ;
                }else {
                    head.next = head.next.next ;
                }

            }

            head = head.next ;
        }


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
