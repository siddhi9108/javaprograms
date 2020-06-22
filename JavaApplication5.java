package javaapplication2;

import java.util.Scanner;

public class JavaApplication5 {

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

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch (ArrayIndexOutofBoundsException e) {
            System.out.println("Index not valid ");

        }
        System.out.println("Hello");
    }

}
