package org.example.linkedlist;

public class RemoveNthFromEnd {
    //mine - accepted
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode current = head;
        int counter = 1;
        while (current.next != null) {
            current = current.next;
            counter++;
        }

        int whichOneToRemoveFromHead = counter - n;
        if (whichOneToRemoveFromHead == 0 && head.next != null) {
            return head.next;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        counter = 1;
        while (counter != whichOneToRemoveFromHead && fast != null) {
            slow = fast;
            fast = fast.next;
            counter++;
        }
        slow.next = fast.next;
        return head;
    }

    //lc solution
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        size -= n;
        current = dummy;
        while (size > 0) {
            size--;
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
}
