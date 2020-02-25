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

    public void deleteFromEnd() {
        int response;
        if (head != null) {
            Node temp = head;
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
            if (previous != null)
                previous.setNext(null);
            else
                head = null;
        } else {
            System.out.println("Element cannot be deleted.Linked lIST is EMPTY");
        }
    }

    public void deleteFromFront() {
        if (head == null) {
            System.out.println("LINKED LIST EMPTY.CANNOT BE DELETED");
        } else {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

}
