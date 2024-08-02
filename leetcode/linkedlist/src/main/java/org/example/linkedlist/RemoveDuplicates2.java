package org.example.linkedlist;

public class RemoveDuplicates2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        curr=head;
        ListNode prev = head;
        int counter =0;
        while(curr.next!=null){
            if(counter==0){
                if(curr.val==curr.next.val){
                    head=curr.next;
                    curr=curr.next;
                }else{
                    prev=curr;
                    curr=curr.next;
                    counter++;
                }
            }
            else{
                if(curr.val==curr.next.val){
                    curr=curr.next;
                    prev.next=curr;
                }else{
                    prev=curr;
                    curr=curr.next;
                }
            }

        }
        return head;
    }
}
