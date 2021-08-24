package javaapplication1;

class Student3 {

    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

public class OanCThroughMethod {

    public static void main(String args[]) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.insertRecord(1, "A");
        s2.insertRecord(2, "B");
        s1.displayInformation();
        s2.displayInformation();
    }
}
