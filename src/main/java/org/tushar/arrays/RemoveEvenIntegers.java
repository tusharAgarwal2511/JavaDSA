package org.tushar.arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 2, 1, 4, 5, 1, 2, 4, 7, 8, 4, 5};
        int len = arr.length;
        int evenCount = 0; // count of the number of even elements

        for (int i = 0; i < len; i++)
            if (arr[i] % 2 == 0) evenCount++;

        int newLen = len - evenCount;
        int[] newArr = new int[newLen];
        int idx = 0;

        for (int i : arr) {
            if (i % 2 == 0) continue;
            newArr[idx] = i;
            idx++;

        }
        printArray(arr); // previous array
        System.out.println(); // line break
        printArray(newArr); // new array
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }
}
