package Klausuren.Jahr_2024.NebenKlausur.Aufgabe_004;

public class LinkedList {
    private class Node {
        private String data;
        private Node next;

        private Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;

    public LinkedList() {
    }

    public LinkedList(LinkedList other) {
        // Aufgabenteil a)
        if (other != null && other.length() > 0) {
            Node ptr = other.head;
            while (ptr.next != null) {
                this.add(ptr.data);
                ptr = ptr.next;
            }
        }
    }

    public void add(String element) {
// fügt element am Ende der Liste ein (fertiger Code nicht abgedruckt)
    }

    public int length() {
        //
        return 10;
    }

    public String get(int index) {
// gibt das Element am gegebenen Index zurück (fertiger Code nicht abgedruckt)
        return null;
    }


    public void printList() {
        if (length() > 0) {
            Node ptr = head;
            System.out.println("[");
            while (ptr.next != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
            System.out.println(ptr.data + "]");
        }
    }

    public String[] toArray() {
        String[] arr = new String[length()];
        Node ptr = head;
        int i = 0;
        while (ptr.next != null) {
            arr[i] = ptr.data;
            ptr = ptr.next;
        }
        return arr;
    }

    public String[] toArray2() {
        String[] arr = new String[length()];
        for (int i = 0; i < length(); i++) {
            arr[i] = get(i);
        }
        return arr;
    }
}