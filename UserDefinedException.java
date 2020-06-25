package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MyException extends Exception {

    @Override
    public String toString() {
        return "Number is not divisible by 5"; //To change body of generated methods, choose Tools | Templates.
    }
}

public class UserDefinedException {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number which is divisible by 5");
        x = ob.nextInt();
        try {
            if (x % 5 != 0) {
                MyException ex = new MyException();
                throw ex;
            }
            System.out.println("Correct number");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
