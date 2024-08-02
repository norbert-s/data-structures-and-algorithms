package org.example.linkedlist;

public class Hascycle {
    //mine accepted
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next!=null){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null) return false;
        }
        return false;
    }
}
