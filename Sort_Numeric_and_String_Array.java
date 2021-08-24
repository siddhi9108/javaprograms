package javaapplication1;

import java.util.*;

public class Sort_Numeric_and_String_Array {

    public static void main(String[] args) {
        int[] arr1 = {23, 55, 47, 555, 4, 555, 59, 56, 258, 586, 5993, 5893358, 666, 8654};
        String[] arr2 = {"Siddhi", "Mahi", "Done", "Java"};
        System.out.println("Original numeric array : " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted numeric array : " + Arrays.toString(arr1));
        System.out.println("Original string array : " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted String array : " + Arrays.toString(arr2));
    }
}
