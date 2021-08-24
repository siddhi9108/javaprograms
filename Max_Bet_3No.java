package javaapplication1;

import java.util.Scanner;

public class Max_Bet_3No {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x");
        x = ob.nextInt();
        System.out.println("Enter y");
        y = ob.nextInt();
        System.out.println("Enter z");
        z = ob.nextInt();
        if (x > y && x > z) {
            System.out.println("Largest no. is x:" + "" + x);
        } else if (y > z) {
            System.out.println("Largest no. is y:" + "" + y);
        } else {
            System.out.println("Largest no. is z:" + "" + z);
        }
    }
}
