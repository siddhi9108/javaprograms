package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ModifyingStrings {

    public static void main(String[] args) {
        String s1 = new String("Hello World");
        System.out.println(s1.substring(1, 5));
        System.out.println(s1.substring(2));

        System.out.println(s1);
        System.out.println(s1.replace('H', 'h'));

    }
}
