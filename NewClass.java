package javaapplication1;

import java.util.*;

public class NewClass {

    public static void main(String[] args, String t) {
        int a;
        double e;
        String s2;
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your int:");
        int b = ob.nextInt();
        System.out.println("Enter your double:");
        double c = ob.nextDouble();
        System.out.println("Enter your string:");
        //ob.nextLine();
        s2 = ob.nextLine();
        a = i + b;
        e = d + c;
        System.out.println(a);
        System.out.println(e);
        System.out.println(s + " " + s2);

    }

}
