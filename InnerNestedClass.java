package javaapplication2;

class Outer {

    void show() {
        System.out.println("In outer class");
    }

    class Inner {

        void disp() {
            System.out.println("In inner class");
        }
    }
}

public class InnerNestedClass {

    public static void main(String[] args) {
        Outer ob1 = new Outer();
        ob1.show();
    }
}
