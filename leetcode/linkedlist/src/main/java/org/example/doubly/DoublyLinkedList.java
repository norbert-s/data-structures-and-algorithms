package org.example.doubly;



public class DoublyLinkedList {
    DoublyListNode head;

    public int getLength(){
        if(head==null) return 0;
        DoublyListNode current = head;
        int counter = 0;
        while(current!=null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void deleteAtIndex(int index) {
        if(head==null) throw new IllegalArgumentException("list is empty you cannot delete");
        else if(index==0 &&head!= null){
            if(head.next==null)head=null;
            else{
                head = head.next;
            }
        }
        else{
            DoublyListNode current = head;
            int counter = 0;
            while(current.next!=null && counter!= index){
                current = current. next;
                counter++;
            }

            DoublyListNode prev = current.prev;
            DoublyListNode next = current.next;
            prev.next = next;
            if(current.next!=null){
                next.prev = prev;
            }
        }

    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
        }
        else{
            int counter = 0;
            DoublyListNode slow = new DoublyListNode(-1);
            slow.next = head;
            DoublyListNode fast = head;
            //1,2 -index is 1
            //question is whether fast.next is the correct one
            while(counter!=index && fast!=null){
                slow = fast ;
                fast=fast.next;
                counter++;
            }
            DoublyListNode newNode = new DoublyListNode(val);

            slow.next = newNode;
            newNode.prev = slow;
            newNode.next = fast;
            if(fast!=null){
                fast.prev=newNode;
            }

        }
    }

    public int get(int index){
        if(head==null) throw new IllegalArgumentException("list is empty!");
        int counter = 0;
        DoublyListNode current = head;
        while(current.next!=null && counter!=index){
            current=current.next;
            counter++;
        }
        return current.val;
    }

    public void addAtHead(int val){
        if(head==null){
            head = new DoublyListNode(val);
        }else{
            DoublyListNode temp = head;
            head= new DoublyListNode(val);
            head.next = temp;
            temp.prev = head;
        }
    }

    public void addAtTail(int val){
        if(head==null){
            head = new DoublyListNode(val);
        }else{
            DoublyListNode current = head;
            while(current.next!=null){
                current=current.next;
            }
            DoublyListNode tailNode= new DoublyListNode(val);
            current.next = tailNode;
            tailNode.prev = current;
        }
    }

    public void print(){
        if(head==null) throw new IllegalArgumentException("list is empty");
        DoublyListNode current = head;

        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }

}
