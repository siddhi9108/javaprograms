package javaapplication1;

import java.util.*;

public class F_to_C {

    public static void main(String[] args) {
        double c, f;
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Choose type of conversion:\n 1- C to F \n 2- F to C");
        x = ob.nextInt();
        switch (x) {
            case 1:
                System.out.println("Enter your C temp.");
                c = ob.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit temperature is = " + f);
                break;
            case 2:
                System.out.println("Enter your F temp.");
                f = ob.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius temperature is = " + c);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
