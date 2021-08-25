package javaapplication1;

import java.util.*;

public class NewClass2 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter A");
        String A = ob.next();
        System.out.println("Enter B");
        String B = ob.next();

        System.out.println(A + " " + B);
        if (A.compareTo(B) < 0) {
            System.out.println("NO");
        }
        System.out.println(A + " " + B);
        if (A.compareTo(B) == 0) {
            System.out.println("NO");
        }
        System.out.println(A + " " + B);
        if (A.compareTo(B) > 0) {
            System.out.println("NO");
        }
        System.out.println(A.length() + B.length());
    }
}
