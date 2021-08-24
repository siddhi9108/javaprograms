package javaapplication1;

import java.io.File;

public class Rename_Fiile {

    public static void main(String[] args) {
        File oldName
                = new File("C:\\List files\\test1.txt");
        File newName
                = new File("C:\\List files\\Siddhi123.txt");

        if (oldName.renameTo(newName)) {
            System.out.println("Renamed successfully");
        } else {
            System.out.println("Error");
        }
    }
}
