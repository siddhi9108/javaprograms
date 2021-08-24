package javaapplication1;

import java.util.Scanner;

public class AlphabetOrNot {

    public static void main(String[] args) {
        char ch;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an Alphabet:");
        ch = ob.next().charAt(0);
        if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
            System.out.print(ch + " is an Alphabet");
        } else {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
