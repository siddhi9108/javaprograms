package javaapplication1;

import java.util.*;

public class Cal_No_of_dig_Lett {

    public static void main(String[] args) {
        String s = null;
        int alph = 0, digi = 0, spc = 0;
        char cha;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter you string");
        //char[] ch = s.toCharArray();
        s=ob.next();
        for (int i = 0; i < s.length(); i++) {
            cha = s.charAt(i);
            if (cha >= 'a' && cha <= 'z' || cha >= 'A' && cha <= 'Z') {
                alph++;
            } else if (cha >= '0' && cha <= '9') {
                digi++;
            } else {
                spc++;
            }
        }
        System.out.println("No. of alph:" + alph);
        System.out.println("no. of digi:" + digi);
        System.out.println("no. of spc:" + spc);
    }
}
