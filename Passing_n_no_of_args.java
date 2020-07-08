package javaapplication2;

class test {

    void show(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}

public class Passing_n_no_of_args {

    public static void main(String[] args) {
        test t1 = new test();
        t1.show("abc");
        System.out.println("=========================");
        t1.show("abc", "xyz");
        System.out.println("=========================");
        t1.show("abc", "xyz", "pqr");
    }
}
