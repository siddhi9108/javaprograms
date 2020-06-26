package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintingChars {

    public static void main(String[] args) {
        String s1 = new String("Hello World");
        System.out.println(s1.charAt(1));

        char[] arr = s1.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }

        byte[] arr1 = s1.getBytes();
        for (byte b : arr1) {
            System.out.println(b);

        }
    }
}
