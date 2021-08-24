package javaapplication1;

class Test {

    static int i;
    int j;

    static {
        i = 10;
        System.out.println("static block called ");
    }

}

public class StaticBlock {

    public static void main(String args[]) {
        System.out.println(Test.i);
    }
}
