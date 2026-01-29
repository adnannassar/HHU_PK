package Datenstrukturen.Generic;

public class NodeGeneric<T> {
    T value;
    NodeGeneric<T> next;

    public NodeGeneric(T value, NodeGeneric<T> next) {
        this.value = value;
        this.next = next;
    }
}
