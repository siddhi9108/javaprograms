package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {

    static void A() {
        try {
            int a = 10, b = 0, c;
            c = a / b;
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            System.out.println("A method finally block executed");
        }
    }

    static void B() {
        try {
            System.out.println("In B");
            return;
        } finally {
            System.out.println("B method finally block executed");
        }
    }

    static void C() {
        try {
            System.out.println("In C");
            return;
        } finally {
            System.out.println("C method finally block executed");
        }
    }

    public static void main(String[] args) {
        try {
            A();

        } catch (Exception e) {

        }

        B();
        C();
    }

}
