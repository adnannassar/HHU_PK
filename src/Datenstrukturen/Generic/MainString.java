package Datenstrukturen.Generic;


public class MainString {
    public static void main(String[] args) {
        MyGenericLinkedList<String> myList = new MyGenericLinkedList<String>();

        myList.add("Bashir");
        myList.add("Ammar");
        myList.add("Nora");
        myList.add("Selim");

        myList.printInfo();

        myList.insert("Zakariya", 2);

        myList.printInfo();

        myList.insert("Adnan", 0);
        myList.printInfo();

        System.out.println("Size: " + myList.size());

        myList.insert("Ali", 6);
        myList.insert("Sara", 50);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        System.out.println("Ist Bashir in der Liste vorhanden? " + myList.search("Bashir")); // true
        System.out.println("Ist Ammar in der Liste vorhanden? " + myList.search("Ammar")); // true
        System.out.println("Ist Saif in der Liste vorhanden? " + myList.search("Saif")); // false

        myList.delete("Bashir");
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete("Selim");
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete("Sara");
        myList.printInfo();
        System.out.println("Size: " + myList.size());

    }
}
