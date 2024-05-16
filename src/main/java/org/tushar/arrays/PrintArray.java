package org.tushar.arrays;

import java.util.Arrays;

// Print the values of an array
public class PrintArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3, 5, 7, 8};
        int len = arr.length; // length of the array

        // Method 1:
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // line break

        // Method 2:
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(); // line break

        // Method 3:
        int i = 0;
        while (i < len) {
            System.out.print(arr[i] + " ");
            i++;
        }

        System.out.println(); // line break

        // Method 4:
        System.out.println(Arrays.toString(arr));

    }
}
