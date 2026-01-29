package Datenstrukturen.DoublyLinkesList;

public class NodeGeneric<T> {
    T value;
    NodeGeneric<T> next;
    NodeGeneric<T> previous;

    public NodeGeneric(T value, NodeGeneric<T> next,  NodeGeneric<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
