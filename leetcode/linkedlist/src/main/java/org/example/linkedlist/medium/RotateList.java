package org.example.linkedlist.medium;

import org.example.linkedlist.LinkedList;
import org.example.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        rotateRight(list.getHead(),2);
        list.print(list.getHead());

    }
    static List<Integer> list = new ArrayList<>();

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode prev = head;
        createList(head);
        List<Integer> rotated = rotateArrayList(k);

        int i =0;
        ListNode curr =prev;
        while(i<rotated.size()){
            curr.val= rotated.get(i);
            curr = curr.next;
//            System.out.println(curr.val);
            //curr = curr.next;
            i++;
        }
        return prev;
    }

    static List<Integer>rotateArrayList(int k){
        List<Integer>  arr = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            arr.add(-1);
        }
        k = k%list.size();
        int j=0;
        for(int i=k;i<arr.size();i++){
            arr.set(i, list.get(j));
            j++;
        }
        k=0;
        for(;j<list.size();j++){
            arr.set(k, list.get(j));
            k++;
        }
        return arr;
    }

    static void createList(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
    }
}
