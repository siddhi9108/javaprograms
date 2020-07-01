package javaapplication2;

class Outer {

    static class Inner {

        void show() {
            System.out.println("In static nested class");
        }
    }
}

public class StaticNestedClass {

    public static void main(String[] args) {
        Outer.Inner ob1 = new Outer.Inner();
        ob1.show();
    }
}
