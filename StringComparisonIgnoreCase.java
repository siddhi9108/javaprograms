package javaapplication1;

public class StringComparisonIgnoreCase {

    public static void main(String[] args) {
        String s1 = new String("ello");
        String s2 = new String("Hello");
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not equals");
        }
    }
}
