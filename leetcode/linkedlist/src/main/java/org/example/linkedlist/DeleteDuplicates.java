package org.example.linkedlist;

public class DeleteDuplicates {
    //deletes duplicates, but not when there are more than two
    //mine
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        //1,1
        ListNode slow = head;
        ListNode lookAhead = head.next;

        while (lookAhead != null) {
            if (slow.val == lookAhead.val) {
                slow.next = lookAhead.next;
            }
            slow = lookAhead;
            lookAhead = lookAhead.next;
        }

        return head;
    }
}
