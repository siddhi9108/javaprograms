package javaapplication1;

import java.util.Scanner;

public class Pos_Neg_Zero {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x");
        x = ob.nextInt();
        if (x > 0) {
            System.out.println("Positive");
        }
        if (x < 0) {
            System.out.println("Negative");
        } else if (x == 0) {
            System.out.println("Zero");
        }
    }
}
