package SortingsAlgorithims;

/**
 * Created by Marwan on 19 Jan, 2024 around 2:27 PM
 */
import java.math.BigInteger;

public class GnomeSortBigInteger {
    public static void main(String[] args) {
        // Example array of BigIntegers
        BigInteger[] bigIntegers = {
                new BigInteger("12345678901234567890"),
                new BigInteger("98765432109876543210"),
                new BigInteger("55555555555555555555"),
                new BigInteger("11111111111111111111")
        };

        // Print the original array
        System.out.println("Original Array:");
        printArray(bigIntegers);

        // Sort the array using Gnome Sort
        gnomeSort(bigIntegers);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        printArray(bigIntegers);
    }

    private static void gnomeSort(BigInteger[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index - 1].compareTo(array[index]) <= 0) {
                index++;
            } else {
                // Swap elements and move back in the array
                BigInteger temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }

    private static void printArray(BigInteger[] array) {
        for (BigInteger num : array) {
            System.out.println(num);
        }
    }
}
