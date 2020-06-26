package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringComparisonIgnoreCase {

    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("Hello");
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not equals");
        }
    }
}
