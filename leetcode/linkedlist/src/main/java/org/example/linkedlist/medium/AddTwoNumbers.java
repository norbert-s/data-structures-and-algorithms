package org.example.linkedlist.medium;

import org.example.linkedlist.LinkedList;
import org.example.linkedlist.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.addToEnd(5);
//        list1.addToEnd(4);
//        list1.addToEnd(3);

        list2.addToEnd(5);
//        list2.addToEnd(6);
//        list2.addToEnd(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode list3 = addTwoNumbers.addTwoNumbers(list1.getHead(), list2.getHead());
        list1.print(list3);
    }
    //https://leetcode.com/problems/add-two-numbers/description/
    //accepted
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode newList = null;
        ListNode curr = null;
        int maradek = 0;
        while (ptr1 != null && ptr2 != null) {
            int number = ptr1.val + ptr2.val + maradek;
            if (maradek > 0) maradek = 0;

            if (number >= 10) {
                number = number % 10;
                maradek = 1;
            }
            if (newList == null) {

                curr = new ListNode(number);
                newList = curr;
            } else {
                curr.next = new ListNode(number);
                curr = curr.next;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == null && ptr2 != null) {
            while (ptr2 != null) {
                int number = ptr2.val + maradek;
                if (maradek > 0) maradek = 0;

                if (number >= 10) {
                    number = number % 10;
                    maradek = 1;
                }

                ptr2 = ptr2.next;
                curr.next = new ListNode(number);
                curr = curr.next;
            }


        } else if (ptr2 == null & ptr1 != null) {
            while (ptr1 != null) {
                int number = ptr1.val + maradek;
                if (maradek > 0) maradek = 0;

                if (number >= 10) {
                    number = number % 10;
                    maradek = 1;
                }

                ptr1 = ptr1.next;
                curr.next = new ListNode(number);
                curr = curr.next;
            }
        }
        if (maradek > 0) {
            curr.next = new ListNode(maradek);
        }
        return newList;
    }

}
