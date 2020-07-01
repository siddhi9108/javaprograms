package javaapplication2;

public class StringKeywords {

    public static void main(String[] args) {
        String s1 = new String("Hello World");

        if (s1.startsWith("Hello")) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
        if (s1.endsWith("Hello")) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
        String s2 = String.join(",", "red", "Yellow", "green");
        System.out.println(s2);

    }
}
