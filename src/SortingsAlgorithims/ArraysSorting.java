package SortingsAlgorithims;

import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 4, 9, 8, 7, 2, 6,0};
//        double[] arr1 = {10.5, 4.2, 96.3, 14.25, 78.25, 1.9};
//        System.out.println(Arrays.toString(sortInsertion(arr)));
        //System.out.println(Arrays.toString(sortGnomeWhile(arr)));

    }



    public  int[] sortGnome(int[] arr)  {
        int i = 1;
        int j = 2;

        while (i < arr.length) {
            if (arr[i - 1] <= arr[i]) {
                i = j;
                j++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }

        }
        return arr;
    }

    public  int[] sortBubble(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public  int[] selectionSort(int[] arr) {
        for (int currentPlace = 0; currentPlace < arr.length; currentPlace++) {
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace + 1;
            for (int check = currentPlace; check < arr.length; check++) {
                if (arr[check] < smallest) {
                    smallestAt = check;
                    smallest = arr[check];
                }
            }
            int temp = arr[currentPlace];
            arr[currentPlace] = arr[smallestAt];
            arr[smallestAt] = temp;
        }

        return arr;
    }

    public  int[] insertionSort (int[] arr){

        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }

        return arr;
    }

    public  int[] cocktailSort(int[] arr){

        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i<=  arr.length  - 2;i++) {
                if (arr[ i ] > arr[ i + 1 ]) {
                    //test if two elements are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i= arr.length - 2;i>=0;i--) {
                if (arr[ i ] > arr[ i + 1 ]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return arr;
    }

    public  int[] combSort(int[] arr){

            int gap_length = arr.length;
            float shrinkFactor = 1.3f;
            boolean swapped = false;

            while (gap_length > 1 || swapped) {
                if (gap_length > 1) {
                    gap_length = (int)(gap_length / shrinkFactor);
                }

                swapped = false;

                for (int i = 0; gap_length + i < arr.length; i++) {
                    if (arr[i] > arr[i + gap_length]) {
                       int temp = arr[i];
                        arr[i] = arr[i+gap_length];
                        arr[i+gap_length] = temp;
                        swapped = true;
                    }
                }
            }

        return arr;
    }

    public  int[] countingSort(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int each: arr){
            if (each>max)max=each;
            if(each<min)min=each;
        }

        int[] ctr = new int[max - min + 1];
        for(int number : arr){
            ctr[number - min]++;
        }
        int z= 0;
        for(int i= min;i <= max;i++){
            while(ctr[i - min] > 0){
                arr[z]= i;
                z++;
                ctr[i - min]--;
            }
        }
        return arr;
    }

    public  int[] shellSort(int[] arr){

        int increment = arr.length / 2;
        while (increment > 0) {
            for (int i = increment; i < arr.length; i++) {
                int j = i;
                int temp = arr[i];
                while (j >= increment && arr[j - increment] > temp) {
                    arr[j] = arr[j - increment];
                    j = j - increment;
                }
                arr[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            }
            else {
                increment *= (5.0 / 11);
            }
        }
        return arr;
    }

    public  int[] bucketSort(int[] arr){
        int max_value = arr[0];
        for (int each :arr){
            if (each>max_value)max_value=each;
        }
        int[] Bucket = new int[max_value + 1];
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            Bucket[arr[i]]++;
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted[outPos++] = i;

        return sorted;
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public  int[] sortGnomeFor(int[] arr) {
        for (int i = 1, j = 2; i < arr.length; ) {
            if (arr[i - 1] <= arr[i]) {
                i = j;
                j++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }

        }
        return arr;
    }
}