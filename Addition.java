
package javaapplication1;

import java.util.Scanner;


public class Addition {

    
    public static void main(String[] args) {
      
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 numbers ");
        a=ob.nextInt();
        b=ob.nextInt();
        c=a+b;
        
        System.out.println("Addition is "+c);
    }
    
}
