package javaapplication1;

class Animal2 {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2 {

    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal2 {

    void meow() {
        System.out.println("meowing...");
    }
}

public class HierarchicalInheritance {

    public static void main(String args[]) {
        //Dog2 c = new Dog2();
        Cat c = new Cat();
        c.meow();//error
        c.eat();
        //c.bark(); 
    }
}
