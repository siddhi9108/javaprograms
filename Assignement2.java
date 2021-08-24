package javaapplication1;

import java.text.NumberFormat;
import java.util.*;

//class Planet
//{
//    String name;
//    double DistFromSun;
//    double relativeGravity;
//    void setDetails(String a, double m,double n)
//    {
//    }
//}
public class Assignement2 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value:");
        double payment = ob.nextDouble();
        ob.close();

        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usF.format(payment);

        System.out.println("US: " + us);
    }
}
