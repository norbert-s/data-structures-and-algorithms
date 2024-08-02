package org.example.doubly;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addAtHead(0);
        doublyLinkedList.addAtHead(1);
        doublyLinkedList.addAtHead(2);
        doublyLinkedList.addAtTail(0);
        doublyLinkedList.addAtTail(1);
        doublyLinkedList.addAtTail(2);
//        doublyLinkedList.print();
        //System.out.println(doublyLinkedList.get(3));

//        doublyLinkedList.addAtIndex(0,10);
//        doublyLinkedList.print();
//        doublyLinkedList.deleteAtIndex(2);
//        doublyLinkedList.print();
        System.out.println(doublyLinkedList.getLength());
    }
}
