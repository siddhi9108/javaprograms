package javaapplication1;

import java.util.*;

public class Alphabet1 {

    public static void main(String[] args) {
        int i, j;
        int[][] arr = new int[5][4];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (i == 4 || j == 0) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
