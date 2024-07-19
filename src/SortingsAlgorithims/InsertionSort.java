package SortingsAlgorithims;

/**
 * Created by Marwan on 19 Jan, 2024 around 2:41 PM
 */



public class InsertionSort {
    public static void main(String[] args) {
        // Example array of integers
        int[] integers = {2,-3,5,-9,0,-25,12,45,3,30};

        // Print the original array
        System.out.println("Original Array:");
        printArray(integers);

        // Sort the array using Insertion Sort
        insertionSort(integers);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        printArray(integers);
    }

    private static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Place the key in its correct position
            array[j + 1] = key;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
