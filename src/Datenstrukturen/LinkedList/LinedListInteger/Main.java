package Datenstrukturen.LinkedList.LinedListInteger;

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

        myList.insert(0, 0);
        myList.printInfo();

        System.out.println("Size: " + myList.size());

        myList.insert(6, 6);
        myList.insert(7, 50);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        System.out.println("Ist 2 in der Liste vorhanden? " + myList.search(2)); // true
        System.out.println("Ist 7 in der Liste vorhanden? " + myList.search(7)); // true
        System.out.println("Ist 100 in der Liste vorhanden? " + myList.search(100)); // false

        myList.delete(0);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete(3);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete(7);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

    }
}
