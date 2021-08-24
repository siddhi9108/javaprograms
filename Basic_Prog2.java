package javaapplication1;

import java.util.Scanner;

public class Basic_Prog2 {

    public static void main(String[] agrs) {
        int a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 2 No");
        a = ob.nextInt();
        b = ob.nextInt();
        c = a + b;
        System.out.println("Addition is" + " " + c);
    }
}
