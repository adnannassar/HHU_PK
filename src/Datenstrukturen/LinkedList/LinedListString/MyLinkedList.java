package Datenstrukturen.LinkedList.LinedListString;

public class MyLinkedList {
    Node head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
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

    public void insert(String value, int index) {
        if (index < 0) {
            System.out.println("Index muss > 0 sein!");
        } else if (index == 0) {
            Node newNode = new Node(value, head);
            head = newNode;
        } else if (index >= size()) {
            add(value);
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

    public int size() {
        int counter = 0;
        Node pointer = head;
        while (pointer != null) {
            pointer = pointer.next;
            counter++;
        }

        return counter;
    }

    public boolean search(String value) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.value.equals(value)) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    public void delete(String value) {
        if (head.value.equals(value)) {
            head = head.next;
        } else {
            Node pointer = head;
            Node before_pointer = head;
            while (pointer != null) {
                if (pointer.value.equals(value)) {
                    before_pointer.next = pointer.next;
                }
                before_pointer = pointer;
                pointer = pointer.next;
            }
        }
    }
}
