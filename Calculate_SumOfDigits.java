package javaapplication1;

import java.util.*;

public class Calculate_SumOfDigits {

    public static void main(String[] args) {
        int x, y, sum = 0;
        Scanner ob = new Scanner(System.in);
        //System.out.println("Enter how many numbers you want?");
        //x = ob.nextInt();
        System.out.println("Enter the how many  numbers u want to enter:");
        x = ob.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            y = ob.nextInt();
            arr.add(y);
        }

        for (Integer z : arr) {
            add(z);
        }

    }

    static void add(int x) {
        int y;
        int sum = 0;
        while (x > 0) {
            y = x % 10;
            sum = sum + y;
            x = x / 10;
        }
        System.out.println("Sum of Digits:" + sum);

    }
}
