package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchMethods {

    public static void main(String[] args) {
        String s1 = new String("Hello World ");
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));

        int x = s1.indexOf("l");
        System.out.println(x);
        System.out.println(s1.indexOf("l", x + 1));
    }
}
