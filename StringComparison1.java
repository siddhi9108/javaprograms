package javaapplication2;

public class StringComparison1 {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("World");
        if (s1.equals(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
        if (s1 == s2) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
