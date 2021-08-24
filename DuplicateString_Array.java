package javaapplication1;

import java.util.*;

public class DuplicateString_Array {

    public static void main(String[] args) {

        String[] arr = {"abc", "siddhi", "abc", "siddhi", "bvc", "wqe"};
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
