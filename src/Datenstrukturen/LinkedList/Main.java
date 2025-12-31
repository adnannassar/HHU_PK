package Datenstrukturen.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(5);

        myList.printInfo();

        myList.insert(3, 2);

        myList.printInfo();
    }
}
