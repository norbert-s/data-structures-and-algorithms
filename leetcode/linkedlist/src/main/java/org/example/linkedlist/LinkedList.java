package org.example.linkedlist;


public class LinkedList {
    private ListNode head;

    public LinkedList() {
    }

    public ListNode getHead() {
        return head;
    }

    public void getLengthOfTwoLists(ListNode headA, ListNode headB) {
        ListNode slowA = headA;
        ListNode slowB = headB;
        int counterA = 0;
        int counterB = 0;
        while(true){
            if(slowA!=null){
                slowA=slowA.next;
                counterA++;
            }
            if(slowB!=null){
                slowB=slowB.next;
                counterB++;
            }
            if(slowB==null && slowA==null){
                break;
            }
        }
        System.out.println(counterA);
        System.out.println(counterB);
    }

    //not mine
    public ListNode reverseListMainRootRecursive(ListNode head) {
        return reverseListMainRecursive(head, null);
    }

    public ListNode reverseListMainRecursive(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode temp = head.next;
        head.next = newHead;
        newHead = head;
        head = temp;
        return reverseListMainRecursive(head, newHead);
    }

    int getElementByIndex(int index){
        ListNode current = head;
        int counter =0;
        while(current.next!=null && counter<index){
            current = current.next;
            counter++;
        }
        return current.val;

    }

    public void deleteAtPos(int index) {
        if (head == null) throw new IllegalArgumentException("list is eempty cannot delete");
        else if (index < 0 || index >= getSize()) {
            throw new IllegalArgumentException("cannot delete from that index");
        } else if (index == 0) {
            head = head.next;
        } else {
            //1,2,3
            ListNode slow = head;
            ListNode fast = head.next;
            int counter = 1;
            while (counter != index && fast != null) {
                slow = fast;
                fast = fast.next;
                counter++;
            }
            slow.next = fast.next;
        }
    }

    public void deleteFromFront() throws IllegalAccessException {
        if (head == null) throw new IllegalAccessException("list is empty cannot delete from front");
        if (head.next == null) head = null;
        else {
            head = head.next;
        }
    }

    public void deleteFromEnd() throws IllegalAccessException {
        if (head == null) throw new IllegalAccessException("list is empty cannot delete from list");
        if (head.next == null) head = null;
        else {
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast.next != null) {
                slow = fast;
                fast = fast.next;
            }
            slow.next = null;
        }
    }

    //assuming that its not illegal index
    //zero based position
    public void insertAtPos(int index, int data) {
        if (index < 0 || index > getSize()) throw new IllegalArgumentException("illegal position");

        ListNode listNode = new ListNode(data);

        //assuming index is correct and its zero
        if (head == null && index == 0) {
            head = listNode;
        } else if (head != null && index == 0) {
            ListNode temp = head;
            head = listNode;
            head.next = temp;
        }

        //
        else {
            ListNode slow = head;
            ListNode fast = head.next;
            int counter = 1;
            while (counter != index && fast != null) {
                slow = fast;
                fast = fast.next;
                counter++;
            }
            slow.next = listNode;
            listNode.next = fast;
        }
    }

    public int getSize() {

        if (head == null) return 0;
        int counter = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void addToEnd(int data) {
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
        } else if (head.next == null) {
            head.next = listNode;
        } else {
            ListNode slow = head;
            while (slow.next != null) {
                slow = slow.next;
            }
            slow.next = listNode;
        }
    }

    public void print() {
        if (head == null) System.out.println("the list is empty");
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void print(ListNode head) {
        if (head == null) System.out.println("the list is empty");
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void addToFront(int data) {
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
        } else {
            ListNode temp = head;
            head = listNode;
            head.next = temp;
        }
    }
}
