package javaapplication1;

import java.util.*;

public class NewClass3_HR {

    public static void main(String[] args) {
        double meal_cost;
        int tip_percent;
        int tax_percent;
        double p1, p2, total_cost;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your meal cost:");
        meal_cost = ob.nextDouble();
        System.out.println("Tip perct.:");
        tip_percent = ob.nextInt();
        System.out.println("Tax perct.:");
        tax_percent = ob.nextInt();
        p1 = (meal_cost * tip_percent) / 100;
        p2 = (meal_cost * tax_percent) / 100;
        total_cost = p1 + p2 + meal_cost;
        System.out.println("Ur total cost is: " + total_cost);

    }
}
