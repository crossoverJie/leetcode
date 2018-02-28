package com.crossoverjie.leetcode.medium;

/**
 * Function:给一个链表，删除链表末尾第N个节点，并返回一个新的链表
 *
 * 主要思路就是要找出需要删除的节点。
 * 使用快慢指针，快指针比慢指针走的快 N 步，慢指针正常走，这样当快指针为空时，当前的慢指针就是要删除的那个节点
 * @author crossoverJie
 *         Date: 28/02/2018 17:46
 * @since JDK 1.8
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        //边界校验
        if (head == null || head.next == null){
            return null ;
        }

        ListNode fast = head ;

        ListNode slow = head ;

        for (int i =0 ;i< n ;i++){
            fast = fast.next ;
        }

        //如果链表长度和 N 相同
        if (fast == null){
            head = head.next ;
            return head ;
        }

        while (fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }


        //删除需要删除的节点
        slow.next = slow.next.next ;
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
