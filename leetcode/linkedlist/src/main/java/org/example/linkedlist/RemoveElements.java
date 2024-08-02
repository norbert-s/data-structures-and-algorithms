package org.example.linkedlist;

public class RemoveElements {
    //from leetcode
    public ListNode removeElements(ListNode head,int data) {
        if (head == null){
            return null;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == data) {
                prev.next = curr.next;
            }
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;

    }

    public ListNode removeElements2(ListNode head, int data) {
        if(head==null||head.val ==data&&head.next==null){
            return null;
        }
        //1 -
        //1,1
        //1,1,2
        //1,2,1
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;



        while(current!=null){

            while(current.val == data){
                System.out.println("itt");
                dummy.next= current.next;
                current =dummy.next;
                if(current==null){
                    break;
                }
            }



        }
        return head;

    }
}
