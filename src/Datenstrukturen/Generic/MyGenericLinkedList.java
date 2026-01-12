package Datenstrukturen.Generic;

public class MyGenericLinkedList<T> {
    NodeGeneric<T> head;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(T value) {
        if (isEmpty()) {
            // head add
            head = new NodeGeneric<T>(value, null);
        } else {
            NodeGeneric<T> pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            NodeGeneric<T> newNode = new NodeGeneric<T>(value, null);
            pointer.next = newNode;
        }
    }

    public void printInfo() {
        NodeGeneric<T> pointer = head;
        System.out.print("[");
        while (pointer.next != null) {
            System.out.print(pointer.value + " --> ");
            pointer = pointer.next;
        }
        System.out.print(pointer.value + "]");
        System.out.println();
    }

    public void insert(T value, int index) {
        if (index < 0) {
            System.out.println("Index muss > 0 sein!");
        } else if (index == 0) {
            NodeGeneric<T> newNode = new NodeGeneric<T>(value, head);
            head = newNode;
        } else if (index >= size()) {
            add(value);
        } else {
            NodeGeneric<T> pointer = head;
            int i = 0;
            while (i < index - 1) {
                pointer = pointer.next;
                i++;
            }
            NodeGeneric<T> newNode = new NodeGeneric<T>(value, null);
            newNode.next = pointer.next;
            pointer.next = newNode;
        }
    }

    public int size() {
        int counter = 0;
        NodeGeneric<T> pointer = head;
        while (pointer != null) {
            pointer = pointer.next;
            counter++;
        }

        return counter;
    }

    public boolean search(T value) {
        NodeGeneric<T> pointer = head;
        while (pointer != null) {
            if (pointer.value.equals(value)) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    public void delete(T value) {
        if (head.value.equals(value)) {
            head = head.next;
        } else {
            NodeGeneric<T> pointer = head;
            NodeGeneric<T> before_pointer = head;
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
