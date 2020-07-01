package javaapplication2;

public class String2 {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello World");

        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println(s1.charAt(0));

        System.out.println(s1.append("hi"));
        System.out.println(s1.deleteCharAt(s1.length() - 1));
        int x = s1.indexOf("hi");
        System.out.println(x);
        System.out.println(s1.delete(x, s1.length()));
        System.out.println(s1.insert(6, "siddhi"));
        System.out.println(s1.reverse());

    }
}
