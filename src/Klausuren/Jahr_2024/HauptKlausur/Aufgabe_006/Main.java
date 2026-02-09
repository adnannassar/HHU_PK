package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_006;

import Datenstrukturen.BinarySearchTree.Node;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("a");
        l1.add("b");

        LinkedList<String> l2 = new LinkedList<>(l1); // erwarted l1["a", "b"] und l2["a", "b"]

        System.out.println("List l1: ");
        l1.printList();

        System.out.println("List l2: ");
        l2.printList();
    }


}
