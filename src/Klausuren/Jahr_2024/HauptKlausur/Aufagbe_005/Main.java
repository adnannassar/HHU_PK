package Klausuren.Jahr_2024.HauptKlausur.Aufagbe_005;
public class Main {
    public static void main(String[] args) {
       BinarySearchTree bs = new BinarySearchTree();
       bs.add(5);
       bs.add(-2);
       bs.add(1);
       bs.add(3);

       // -2,1,3,5, --> toString
        // split(',') --> String[]{"-2" , "1", "3", "5"}

       int[] reserved = bs.toArrayReserved();
       printArray(reserved);


    }

    public static void printArray(int[] array) {
       for(int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
       }
    }
}
