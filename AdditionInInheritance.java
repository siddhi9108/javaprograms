package javaapplication1;
class S {

    int i;

    S() {
        i = 10;
        System.out.println("S class constructor called");
    }
}

class D extends S {

    int j;

    D() {

        j = 20;
        System.out.println("D class constructor called");
    }

    void add() {
        System.out.println(i + j);
    }
}

public class AdditionInInheritance {
    public static void main(String[] args) {

        D ob = new D();
        ob.add();
    }
}
