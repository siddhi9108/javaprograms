package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throws {

    static void show() throws FileNotFoundException, ArithmeticException {
        FileInputStream fin;
        int a = 10, b = 0, c;
        fin = new FileInputStream("D:\\My Document\\Desktop\\Siddhi\\My work");
        c = a / b;
    }

    public static void main(String[] args) {

    }
}
