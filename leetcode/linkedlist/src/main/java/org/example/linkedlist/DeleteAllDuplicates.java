package org.example.linkedlist;

public class DeleteAllDuplicates {
    //mine accepted
    public ListNode deleteAllDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        //1,1,2

        ListNode dummy = head;
        ListNode next = head.next;

        while (next != null) {

            while (dummy.val == next.val) {
                dummy.next = next.next;
                next = dummy.next;
                if (next == null) break;
            }
            if (next == null) {
                dummy.next = null;
            } else {
                dummy = next;
                next = dummy.next;
            }
        }

        return head;
    }

    //not mine-leetcode
    public ListNode _deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


}
