package javaapplication2;


public class JavaApplication3 {

    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Hello");
    }

}
