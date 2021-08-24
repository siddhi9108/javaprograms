package javaapplication1;

import java.util.*;

public class Avg_Array {

    public static void main(String[] args) {
        int i, avg = 0, sum = 0;
        Scanner ob = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter ur array");
        for (i = 0; i < 5; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Ur array");
        for (i = 0; i < 5; i++) {
            sum = sum + arr[i];
            avg = sum / 5;
        }

        System.out.println("ur avg:" + avg);
    }
}
