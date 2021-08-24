package javaapplication1;

import java.util.*;

public class Count_Odd_Even {

    public static void main(String[] args) {
        int count=0,count1=0;
        int x[] = {23,1,45,67,3,7,9};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
               // System.out.println(count);
                count++;
            }else{
                count1++;
            }
        }
        System.out.println("Even Numbers:"+count1);
        System.out.println("Odd Numbers:"+count);
    }
}
