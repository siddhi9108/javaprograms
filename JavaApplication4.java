package javaapplication2;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Hello");
    }

}
