package javaapplication1;

import java.util.*;

public class Sum_of_Arrays {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i, sum = 0;
        int[] arr = new int[5];
        System.out.println("Enter ur array");
        for (i = 0; i < 5; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Ur array");
        for (i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        System.out.println("ur sum:" + sum);

    }
}
