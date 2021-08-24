package javaapplication1;

class Student {

    int rollno;//instance variable  
    String name;
    static String college = "VIT";//static variable  
    //constructor  

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    //method to display the values 

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticVariable {

    public static void main(String args[]) {
        Student s1 = new Student(15, "Mahi");
        Student s2 = new Student(16, "Siddhi");
        //we can change the college of all objects by the single line of code  
        //Student.college="BBDIT";  
        s1.display();
        s2.display();
    }
}
