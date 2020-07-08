package javaapplication2;

class Test {

    void show(String names[]) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}

public class Passing_variable_no_of_args {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        Test t1 = new Test();
        t1.show(arr);
    }

}
