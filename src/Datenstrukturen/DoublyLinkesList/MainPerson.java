package Datenstrukturen.DoublyLinkesList;


public class MainPerson {
    public static void main(String[] args) {
        MyGenericLinkedList<Person> myList = new MyGenericLinkedList<Person>();

        Person p1 = new Person("Bashir", 25);
        Person p2 = new Person("Ammar", 21);
        Person p3 = new Person("Nora", 24);
        Person p4 = new Person("Selim", 22);

        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);

        myList.printInfo();


        myList.insert(new Person("Kakariya" , 30), 2);

        myList.printInfo();

        myList.insert(new Person("Adnan", 31), 0);
        myList.printInfo();

        System.out.println("Size: " + myList.size());

        myList.insert(new Person("ALi", 28), 6);

        Person p5 = new Person("Sara", 26);
        myList.insert(p5, 50);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        System.out.println("Ist Bashir in der Liste vorhanden? " + myList.search(p1)); // true
        System.out.println("Ist Ammar in der Liste vorhanden? " + myList.search(p2)); // true
        System.out.println("Ist Saif in der Liste vorhanden? " + myList.search(new Person("Saif", 20))); // false

        myList.delete(p1);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete(p4);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

        myList.delete(p5);
        myList.printInfo();
        System.out.println("Size: " + myList.size());

    }
}
