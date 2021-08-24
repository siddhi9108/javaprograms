
package javaapplication1;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        int x = 0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number: ");
        x=ob.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {

            System.out.println("Odd");
        }
    }
}




