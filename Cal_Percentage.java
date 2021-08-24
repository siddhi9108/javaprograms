package javaapplication1;

import java.util.Scanner;

public class Cal_Percentage {

    public static void main(String[] args) {
        float a, b, c, d, e, f;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your Physics marks");
        a = ob.nextFloat();
        System.out.println("Enter your Chem marks");
        b = ob.nextFloat();
        System.out.println("Enter your Bio marks");
        c = ob.nextFloat();
        System.out.println("Enter your Maths marks");
        d = ob.nextFloat();
        System.out.println("Enter your Comp. marks");
        e = ob.nextFloat();
        f = (a + b + c + d + e)/5;
        System.out.println("Your % is:" + "" + f);
        if (f >= 90) {
            System.out.println("Your grade is A");
        }
        else if (f >= 80) {
            System.out.println("Your grade is B");
        }
        else if (f >= 70) {
            System.out.println("Your grade is C");
        }
        else if (f >= 60) {
            System.out.println("Your grade is D");
        }
        else if (f >= 50) {
            System.out.println("Your grade is F");
        }
        
    }
}
