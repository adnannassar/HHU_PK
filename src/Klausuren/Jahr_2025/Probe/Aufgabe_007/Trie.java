package Klausuren.Jahr_2025.Probe.Aufgabe_007;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Trie implements Predicate<Trie> {
    @Override
    public boolean test(Trie trie) {
        return trie.size(root) > 5;
    }

    private class Node {
        private char data;
        private ArrayList<Node> next; // niemals null, _nicht_ sortiert, keine Duplikate
        private boolean ende;

        private Node(char data, ArrayList<Node> next, boolean ende) {
            this.data = data;
            this.next = next;
            this.ende = ende;
        }
    }

    private Node root = new Node(' ', new ArrayList<Node>(), false);

    public void add(String wort) {
        // ... (Code nicht abgedruckt)
    }


    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        int size = 0;
        for (Node next : node.next) {
            size += size(next);
        }
        if (node.ende) {
            return 1 + size;
        } else {
            return size;
        }
    }
}
