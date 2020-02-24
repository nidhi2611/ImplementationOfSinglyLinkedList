package singlylinkedlist;

import node.Node;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;

        }
    }

    public void traverse() {
        System.out.println("Printing LinkedList");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
