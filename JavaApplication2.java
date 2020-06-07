package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number");
        x = ob.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }

    }

}
