package javaapplication1;

class U {

    @Override
    public String toString() {
        return "obj of U"; 
    }
}

class W extends U {

    @Override
    public String toString() {
        return "obj of W";
    }
}
public class NeedOfOverriding {

    public static void main(String[] args) {

        U ob1 = new U();
        W ob2 = new W();
        System.out.println(ob1);
        System.out.println(ob2);
    }
}
