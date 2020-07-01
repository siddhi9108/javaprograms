package javaapplication2;

class Outer {

    void show() {
        class Inner {

            void disp() {
                System.out.println("Inner class");
            }
        }
        Inner ob2 = new Inner();
        ob2.disp();
    }
}

public class MethodLocalInnerClass {

    public static void main(String[] args) {
        Outer ob1 = new Outer();
        ob1.show();
    }
}
