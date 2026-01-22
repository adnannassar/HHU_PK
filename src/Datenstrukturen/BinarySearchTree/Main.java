package Datenstrukturen.BinarySearchTree;

public class Main {
    static BinarySearchTree bst = new BinarySearchTree();
    public static void main(String[] args) {
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(1);
        bst.add(8);
        bst.add(12);
        bst.add(20);

        System.out.println("Traverse In   Order: " + bst.traverseInOrder());
        System.out.println("Traverse Pre  Order: " + bst.traversePreOrder());
        System.out.println("Traverse Post Order: " + bst.traversePostOrder());

        printSearchResultRecursiveCall(10);
        printSearchResultRecursiveCall(20);
        printSearchResultRecursiveCall(1);
        printSearchResultRecursiveCall(30);

        System.out.println();

        printSearchResultIterativeCall(10);
        printSearchResultIterativeCall(20);
        printSearchResultIterativeCall(1);
        printSearchResultIterativeCall(30);

    }

    private static void printSearchResultRecursiveCall(int nr) {
        boolean nrFound = bst.search(nr);
        if (nrFound) {
            System.out.println(nr + " wurde im Baum gefunden! (Recursive)");
        }else{
            System.out.println(nr + " wurde im Baum nicht gefunden! (Recursive)");
        }
    }

    private static void printSearchResultIterativeCall(int nr) {
        boolean nrFound = bst.searchIterative(nr);
        if (nrFound) {
            System.out.println(nr + " wurde im Baum gefunden! (Iterative)");
        }else{
            System.out.println(nr + " wurde im Baum nicht gefunden! (Iterative)");
        }
    }
}
