package javaapplication1;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your number:");
        x = ob.nextInt();
        if (x % 2 != 0) {
            System.out.println("Wierd");
        }
        if (x % 2 == 0 && x >= 2 && x <= 5) {
            System.out.println("Not Weird");
        }
        if (x % 2 == 0 && x >= 6 && x <= 20) {
            System.out.println("Wierd");
        }
        if (x % 2 == 0 && x > 20) {
            System.out.println("Not wierd");
        }

    }
}
