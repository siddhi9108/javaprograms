package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if (s1.equals(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not equals");
        }
    }
}
