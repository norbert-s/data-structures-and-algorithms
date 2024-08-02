package org.example.linkedlist;

public class MergeTwoLists {

    //accepted
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        else if(l2==null) return l1;

        ListNode current = new ListNode(-1);
        ListNode dummy = current;

        while(l1!=null && l2!=null){
            if(l1.val <=l2.val){
                current.next = l1;
                l1=l1.next;
                current = current.next;
            }else{
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }
        if(l2==null) current.next = l1;
        if(l1==null) current.next = l2;

        return dummy.next;
    }
}
