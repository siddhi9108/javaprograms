package javaapplication1;

class Demo {

    public static void demoMethod() {
        System.out.println("method of super class");
    }
}

class Sample extends Demo {

    public static void demoMethod() {
        System.out.println("method of sub class");
    }
}

public class MethodHiding {

    public static void main(String args[]) {
        Sample.demoMethod();
    }
}

