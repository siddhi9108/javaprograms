package javaapplication1;

import java.util.Scanner;

public class DaysInThatMonth {

    public static void main(String[] args) {
        int x;
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your month number:");
        x = ob.nextInt();
        
        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            System.out.println("No. of days are 31");
        } else if (x == 4 || x == 6 || x == 9 || x == 11) {
            System.out.println("No. of days are 30");
        } else {
            System.out.println("No. of days are 29 or 28");
        }

    }
}
