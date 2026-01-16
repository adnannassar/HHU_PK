package Suchen.BinarySearch;

import Arrays.OneDimArray.SecondStep;
import Sort.InsertionSort.InsertionSort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {57, 16, 62, 30, 80, 7, 21, 78, 87, 15, 41};

        // Sorting the array before performing binary search
        InsertionSort.insertionSort(array);
        SecondStep.printArray(array);
        int n = 80;
        int m = 200;

        // Test iterative binary search
        int searchResultNIterative = binarySearchIterative(array, n); // gefunden
        int searchResultMIterative = binarySearchIterative(array, m); // nicht gefunden

        // Test recursive binary search
        int searchResultNRecursive = binarySearchRecursive(array, 0, array.length - 1, n);  // gefunden
        int searchResultMRecursive = binarySearchRecursive(array, 0, array.length - 1, m); // nicht gefunden

        System.out.println("\nIterative and Recursive for " + n);
        printSearchResult("Iterative", n, searchResultNIterative);
        printSearchResult("Recursive", n, searchResultNRecursive);

        System.out.println("\nIterative and Recursive for " + m);
        printSearchResult("Iterative", m, searchResultMIterative);
        printSearchResult("Recursive", m, searchResultMRecursive);
    }

    public static void printSearchResult(String method, int nr, int result) {
        if (result != -1) {
            System.out.println(method + " : is " + nr + " exist ? --> true,  in the index " + result);
        } else {
            System.out.println(method + " : is " + nr + " exist ? --> false");
        }
    }


    public static int binarySearchIterative(int[] array, int nr) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (array[m] == nr) {
                return m;
            }
            if (array[m] < nr) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int left, int right, int searchedValue) {
        if (left <= right) {
            // erstmal die Mitte des Arrays finden
            int middle = left + (right - left) / 2;

            // prüfen ob das gesuchetes Element in der Mitte ist
            if (array[middle] == searchedValue) {
                return middle;
            }
            // wenn das gesuchte Elemtnt großer als den Wert in der Mitte ist!
            if (array[middle] < searchedValue) {
                return binarySearchRecursive(array, middle + 1, right, searchedValue);

            // wenn das gesuchte Elemtnt kleiner als den Wert in der Mitte ist!
            } else {
                return binarySearchRecursive(array, left, middle - 1, searchedValue);
            }
        }
        return -1;
    }
}