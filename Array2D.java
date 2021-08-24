package javaapplication1;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int i, j;
        System.out.println("Enter Array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = ob.nextInt();
            }
        }
        System.out.println("Your Array...");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }

}
