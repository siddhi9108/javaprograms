package javaapplication2;

import java.util.Scanner;

public class Catch1Exception2 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int[] arr = new int[5];
        int a, b, c;
        System.out.println("Enter 2 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
        try {
            arr[10] = 100;
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException | ArrayIndexOutofBoundsException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Cannot divide by zero");
            }
            if (e instanceof ArrayIndexOutofBoundsException) {
                System.out.println("Index Invalid");
            }

        }
        System.out.println("Hello");
    }

}
