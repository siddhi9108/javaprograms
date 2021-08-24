package javaapplication1;

import java.util.*;

public class Index_of_array {

    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 4, 55, 54, 4, 22, 7, 89, 90, 75, 21};
        int x = 55;
        int index = -1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == x) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of  arr  is : " + index);
    }
}
