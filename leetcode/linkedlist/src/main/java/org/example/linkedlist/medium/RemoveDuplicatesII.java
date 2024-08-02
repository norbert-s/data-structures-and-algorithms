package org.example.linkedlist.medium;

import org.example.linkedlist.ListNode;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        ListNode curr = head;
        while(curr!=null){
            if(map.containsKey(curr.val)){
                map.put(curr.val,2);
            }else{
                map.put(curr.val,1);
            }
            curr=curr.next;
        }
        //----------------------------------------------

        curr=head;
        ListNode prev = head;
        int counter =0;
        while(curr!=null){
            if(counter==0){
                if(map.get(curr.val)>1){
                    head=curr.next;
                    curr=curr.next;
                }else{
                    prev=curr;
                    curr=curr.next;
                    counter++;
                }
            }
            else{
                if(map.get(curr.val)>1){
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
