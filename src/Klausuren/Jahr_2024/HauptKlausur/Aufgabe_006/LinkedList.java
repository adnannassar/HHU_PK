package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_006;

public class LinkedList<T> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;

    public LinkedList() {
    }

    public LinkedList(LinkedList<T> other) {
        // Aufgabenteil a)
        if (other != null && other.size() > 0) {
            Node ptr = other.head;
            while (ptr.next != null) {
                this.add(ptr.data);
                ptr = ptr.next;
            }
        }
    }

    public void add(T element) {
// fügt element am Ende der Liste ein (fertiger Code nicht abgedruckt)
    }

    public int size() {
// gibt Anzahl der Elemente in der Liste zurück (fertiger Code nicht abgedruckt)
        return 10;
    }

    public T get(int index) {
// gibt das Element am gegebenen Index zurück (fertiger Code nicht abgedruckt)
        return null;
    }


    public void printList() {
        if(size() > 0){
            Node ptr = head;
            System.out.println("[");
            while (ptr.next != null){
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
            System.out.println(ptr.data + "]");
        }
    }
}