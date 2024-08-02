package org.example.linkedlist;


public class ReverseLinkedList {

    //from mastering c++
    ListNode reverse(ListNode head){
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;
        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        return q;
    }

}
