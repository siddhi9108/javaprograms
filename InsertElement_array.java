package javaapplication1;

import java.util.Arrays;

public class InsertElement_array {

    public static void main(String[] args) {
        int[] arr = {12, 85, 7, 4, 5, 45, 1, 20, 3, 66, 49, 77, 777, 856, 556};
        int indexno = 3;
        int no = 22;
        System.out.println("Original Array : " + Arrays.toString(arr));

        for (int i = arr.length - 1; i > no; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexno] = no;
        System.out.println("New Array: " + Arrays.toString(arr));
    }
}
