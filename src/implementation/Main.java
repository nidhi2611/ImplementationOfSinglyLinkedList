package implementation;

import singlylinkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(10);
        singlyLinkedList.insertAtEnd(20);
        singlyLinkedList.traverse();
        singlyLinkedList.insertAtEnd(50);
        singlyLinkedList.insertAtBeginning(0);
        singlyLinkedList.traverse();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.deleteFromEnd();
        singlyLinkedList.traverse();
    }
}
