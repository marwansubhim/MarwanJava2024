package SortingsAlgorithims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Marwan on 19 Jan, 2024 around 1:51 PM
 */
public class BucketSort {

    public static void main(String[] args) {

        System.out.println("Bism Allah Al Rahman Al Raheem");

        System.out.println("****************************");

        Integer[] intArr = {9,2,3,5,8,4,25,-3,-12,0,5,4,-3};


    }


}



 /*


    public static void bucketSort(Double[] array) {
        int n = array.length;

        if (n <= 0) {
            return; // Empty array or invalid input
        }

        @SuppressWarnings("unchecked")
        List<Double>[] buckets = new ArrayList[n];

        // Initialize buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets[bucketIndex].add(array[i]);
        }

        // Sort each bucket
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double element : bucket) {
                array[index++] = element;
            }
        }
    }

    private static void printArray(Object[] array) {
        for (Object value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

     */
