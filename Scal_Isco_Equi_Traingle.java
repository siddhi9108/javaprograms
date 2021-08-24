package javaapplication1;

import java.util.Scanner;

public class Scal_Isco_Equi_Traingle {

    public static void main(String[] args) {
        int x, y, z;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter x:");
        x = ob.nextInt();
        System.out.println("Enter y:");
        y = ob.nextInt();
        System.out.println("Enter z:");
        z = ob.nextInt();
        if (x == y && y == z) {
            System.out.println("Equilateral Triangle");
        }else  if (x == y || y == z || z == x) {
            System.out.println("Isoceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
