package javaapplication1;

import java.util.*;

public class SumOfTwoDigits {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x");
        x = ob.nextInt();
        System.out.println("Enter y");
        y = ob.nextInt();
        sum = x + y;
        if (sum >= 15 && sum <= 20) {
            System.out.println("20");
        } else {
            System.out.println(sum);
        }
    }
}
