package javaapplication1;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        int x = 0, y = 1, z, count = 2;
        System.out.println(x + "" + y);
        for (int i = 2; i < count; i++) {
            z = x + y;
            System.out.println("" + z);
            x = y;
            y = z;
        }
    }
}
