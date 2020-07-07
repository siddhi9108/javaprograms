package javaapplication2;

import java.util.Scanner;

public class UniversalCatchBlock {

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

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }

}
