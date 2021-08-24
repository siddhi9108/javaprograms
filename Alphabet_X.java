package javaapplication1;

import java.util.*;

public class Alphabet_X {

    public static void main(String[] args) {
        int i, j;
        //int[][] arr = new int[6][6];
        for (i = 0; i < 6 ; i++) {
            for (j = 0; j < 6; j++) {
                if (i == j || i+j==5) {
                    System.out.printf("*");
                
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
