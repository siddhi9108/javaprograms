package javaapplication1;

import java.util.*;

public class Random_bet_1to10 {

    public static void main(String[] args) {
        int answer, guess = 0;
        Random ob = new Random();
        Scanner ob1 = new Scanner(System.in);
         System.out.println("Guess a number between 1 and 10: ");
        guess=ob.nextInt(10);
        answer = ob1.nextInt();
       

        if (guess > answer) {
            System.out.println("Too high");
        }
        else if (guess < answer) {
            System.out.println("Too low");
        } else {
            System.out.println("Yes, you guessed the number.");
        }
        System.out.println(answer+" "+guess);

    }
}
