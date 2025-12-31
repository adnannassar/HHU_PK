package Datenstrukturen.LinkedList;

public class MyLinkedList {
    Node head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int value) {
        if (isEmpty()) {
            // head add
            head = new Node(value, null);
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            Node newNode = new Node(value, null);
            pointer.next = newNode;
        }
    }

    public void printInfo() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void insert(int value, int index) {
        if (index < 0) {
            System.out.println("Index muss > 0 sein!");
        } else {
            Node pointer = head;
            int i = 0;
            while (i < index - 1) {
                pointer = pointer.next;
                i++;
            }
            Node newNode = new Node(value, null);
            newNode.next = pointer.next;
            pointer.next = newNode;
        }

    }
}
