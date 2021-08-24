package javaapplication1;

import java.util.*;

public class Question_13_loops {

    public static void main(String[] args) {
        int x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your no." );
        x = ob.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            if (x % 5 == 0) {
                System.out.println("Printed no." + "" + x);
            }
            continue;
        }
    }
}
