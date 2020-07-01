package javaapplication2;

interface A {

    void add(int x, int y);
}

public class Anonymous_UsingInterface {

    public static void main(String[] args) {
        A ob1 = new A() {
            @Override
            public void add(int x, int y) {
                System.out.println(x + y);
            }
        };
        ob1.add(100, 200);

    }


}
