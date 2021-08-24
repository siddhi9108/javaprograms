package javaapplication1;

import java.util.*;

public class DuplicateNo_Array {

    public static void main(String[] args) {
        int[] arr = new int[]{45, 1, 2, 3, 6, 5, 4, 7, 8, 1,6};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
