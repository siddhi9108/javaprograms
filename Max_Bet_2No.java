package javaapplication1;

import java.util.Scanner;

public class Max_Bet_2No {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x");
        x = ob.nextInt();
        System.out.println("Enter y");
        y = ob.nextInt();
        if (x > y) {
            System.out.println("x is greater than y");
        }
        if (x < y) {
            System.out.println("y is greater than x");
        }
        if (x == y) {
            System.out.println("x is equal to y");
        }
    }
}
