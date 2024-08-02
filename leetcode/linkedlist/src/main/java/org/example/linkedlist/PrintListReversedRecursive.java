package org.example.linkedlist;

public class PrintListReversedRecursive {
    public void printListReversedRecursiveHelper(ListNode head){
        if(head==null) System.out.println("empty");
        else printListReversedRecursive(head);
    }

    //mine accepted -ok
    public void printListReversedRecursive(ListNode head){
        if(head==null) return;
        else{
            ListNode current = head;
            if(current!=null){
                printListReversedRecursive(current.next);
                System.out.println(current.val);
            }
        }
    }

    //mine checked ok
    public void printReversedLinkedListRecursive(ListNode listNode) {
        if (listNode.next == null)
            System.out.println(listNode.val);
        else {
            printReversedLinkedListRecursive(listNode.next);
            System.out.println(listNode.val);
        }
    }
}
