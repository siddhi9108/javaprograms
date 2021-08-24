package javaapplication1;

import java.util.*;

public class Print_no_from_0to6 {

    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            if (i == 3 || i == 6) {
                continue;
            }
            System.out.println(i + "");
        }
    }
}
