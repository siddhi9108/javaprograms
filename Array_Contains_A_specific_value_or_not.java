package javaapplication1;

import java.util.*;

public class Array_Contains_A_specific_value_or_not {

    public static void main(String[] args) {
        int[] arr = {2, 54, 8, 6, 7, 22, 45, 78, 36, 4, 98, 64, 100};
        int x = 10;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Array contains the given element");
            }
        }
    }
}