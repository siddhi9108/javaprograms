package javaapplication1;

import java.util.Arrays;

public class Copy_Array {

    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr1 = new int[10];

        System.out.println("Original Array : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("New Array: " + Arrays.toString(arr1));
    }
}
