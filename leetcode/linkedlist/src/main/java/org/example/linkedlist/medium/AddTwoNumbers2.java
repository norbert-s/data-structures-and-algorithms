package org.example.linkedlist.medium;

import org.example.linkedlist.LinkedList;
import org.example.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.addToEnd(7);
        list1.addToEnd(2);
        list1.addToEnd(4);
        list1.addToEnd(3);

        list2.addToEnd(5);
       list2.addToEnd(6);
        list2.addToEnd(4);

        AddTwoNumbers2 addTwoNumbers = new AddTwoNumbers2();
        ListNode list3 = addTwoNumbers.addTwoNumbers(list1.getHead(), list2.getHead());
        list1.print(list3);
    }


//    //https://leetcode.com/problems/add-two-numbers-ii/
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        createLists(l1,l2);
        int maradek = 0;
        int i=list1.size()-1;
        int j=list2.size()-1;
        ListNode newList = null;
        ListNode curr = null;
        List<Integer> finalList = new ArrayList<>();
        while (i>=0&&j>=0) {
            int number = list1.get(i) + list2.get(j) + maradek;
            if (maradek> 0) maradek = 0;

            if (number >= 10) {
                number = number % 10;
                maradek = 1;
            }

            finalList.add(number);
            i--;
            j--;
        }

        while (j>=0) {
            int number = list2.get(j) + maradek;
            if (maradek > 0) maradek = 0;

            if (number >= 10) {
                number = number % 10;
                maradek = 1;
            }
            j--;
            finalList.add(number);
        }
        while (i>=0) {
            int number = list1.get(i) + maradek;
            if (maradek > 0) maradek = 0;

            if (number >= 10) {
                number = number % 10;
                maradek = 1;
            }

            i--;
            finalList.add(number);
        }
        if (maradek > 0) {
            finalList.add(maradek);
        }
        return copyToNode(finalList);
    }

    ListNode copyToNode(List<Integer> list){
        ListNode head=new ListNode(-1);
        ListNode node = null;
        for(int i=list.size()-1;i>=0;i--){
            if(node==null){
                node = new ListNode(list.get(i));
                head = node;
            }else{
                node.next = new ListNode(list.get(i));
                node=node.next;
            }
        }
        return head;
    }



    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    void createLists(ListNode l1, ListNode l2){
        while(l1!=null && l2 !=null){
            list1.add(l1.val);
            list2.add(l2.val);
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
    }
}
