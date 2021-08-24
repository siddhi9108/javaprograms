package javaapplication1;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the year:");
        x = ob.nextInt();
        if ((x % 4 == 0 && x%100!=0) || x%400==0 ) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
