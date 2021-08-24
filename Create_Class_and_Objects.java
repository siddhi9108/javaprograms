package javaapplication1;

import java.util.*;

class student {

    String firstname;
    String lastname;
    int classyear;

    student() {
        firstname = "Unknown";
        lastname = "Unknown";
        classyear = 0;
    }

    void setDetails(String n, String m, int a) {
        firstname = n;
        lastname = m;
        classyear = a;
    }

    void printDetails() {
        System.out.println("My name is: " + firstname + " " + lastname + " " + "And class year is:" + classyear);
    }

}

public class Create_Class_and_Objects {

    public static void main(String[] args) {
        student ob1 = new student();
        student ob2 = new student();
        ob1.setDetails("Siddhi", "Amilkanthwar", 2021);
        ob2.setDetails("Parth", "Amilkanthwar", 2019);
        ob1.printDetails();
        ob2.printDetails();
    }

}
