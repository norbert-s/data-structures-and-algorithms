package org.example.linkedlist;

public class SwapPairs {
    public ListNode swapPairs2(ListNode head) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode before = dummy;

        while (before.next != null && before.next.next != null) {

            ListNode first = before.next;

            ListNode second = before.next.next;

            first.next = second.next;

            before.next = second;

            before.next.next = first;

            before = before.next.next;
        }
        return dummy.next;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //1,2

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode second = head.next;
        while (second.next != null) {
            ListNode out = second.next;
            dummy.next = second;
            second.next = current;
            current.next = out;
        }
        return dummy.next;


    }
}
