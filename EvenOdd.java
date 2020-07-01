package javaapplication2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no.");
        x = ob.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
