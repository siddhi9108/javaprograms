package javaapplication2;

class Outer {

    String msg = "Hello world";

    void show() {
        System.out.println("In outer class");
    }

    class Inner {

        void disp() {
            System.out.println(msg);
        }
    }
}

public class InnerClassInMain {

    public static void main(String[] args) {
        Outer.Inner ob2 = ob1.new Inner();
        ob2.disp();
    }
}
