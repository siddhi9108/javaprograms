package javaapplication1;

import java.util.*;

public class Find_Index_of_Array {

    public static int findIndex(int[] arr, int t) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {78,54,98,63,44,51,23,13,72,97,20,78};
        System.out.println("Index position of 100 is: " + findIndex(arr, 100));
        System.out.println("Index position of 78 is: " + findIndex(arr,78 ));
    }
}
