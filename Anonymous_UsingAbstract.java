package javaapplication2;

class A {

    void show() {

        System.out.println("In A");
    }

    abstract void add(int x, int y);
}

public class Anonymous_UsingAbstract {

    public static void main(String[] args) {
        A ob1 = new A() {
            @Override
            void add(int x, int y) {
                System.out.println(x + y);
            }
        };
        ob1.show();
        ob1.add(100, 200);

    }

}
