package Datenstrukturen.Generic;

public class NodeGeneric<T> {
    T value;
    NodeGeneric next;

    public NodeGeneric(T value, NodeGeneric next) {
        this.value = value;
        this.next = next;
    }
}
