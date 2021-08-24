package javaapplication1;

import java.util.Scanner;

public class Alph_Dig_SplChar {

    public static void main(String[] args) {
        int x;
        char ch;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your character");
        ch = ob.next().charAt(0);
        x=ch;
        if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
            System.out.println("These are alphabets");
        } else if (ch >= 48 && ch <= 56) {
            System.out.println("These are digits");
        } else {
            System.out.println("These are Special Characters");
        }
    }
}
