package javaapplication1;

class Super {

    String name = "Krishna";
    int age = 25;
}

class Sub extends Super {

    String name = "Vishnu";
    int age = 22;

    public void display() {
        Sub obj = new Sub();
        //System.out.println("Name: " + obj.name);
        System.out.println("Name: "+super.name);
        //System.out.println("age: " + obj.age);  
        System.out.println("age: "+super.age);

    }
}

public class FieldHiding {

    public static void main(String args[]) {
        new Sub().display();
    }
}
