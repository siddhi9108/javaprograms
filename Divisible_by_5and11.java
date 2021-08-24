package javaapplication1;

import java.util.Scanner;

public class Divisible_by_5and11 {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your number");
        x = ob.nextInt();
        if (x % 5 == 0 && x % 11 == 0) {
            System.out.println("Yes, the number is divisible by 5 and 11");
        } else {
            System.out.println("No, the number is divisible by 5 and 11");
        }
    }
}
