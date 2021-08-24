package javaapplication1;

class Student2 {

    int id;
    String name;
}

public class OandCThroughRef {

    public static void main(String args[]) {
        Student2 s1 = new Student2();
        s1.id = 1;
        s1.name = "S";
        System.out.println(s1.id + " " + s1.name);
    }
}
