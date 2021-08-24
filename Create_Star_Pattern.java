package javaapplication1;

import java.util.*;

public class Create_Star_Pattern {

    public static void main(String[] args) {
        int i, j, x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        x = ob.nextInt();
        for (i = 0; i <= x - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = x - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

}
