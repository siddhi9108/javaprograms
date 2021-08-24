package javaapplication1;

import java.io.File;
import java.io.IOException;

public class FOS_Using_const {

    public static void main(String[] args) {
        File file = new File("C:\\List files\\file.txt");
        try {
            boolean createFile = file.createNewFile();
            if (createFile) {
                System.out.println("New File is created");
            } else {
                System.out.println("File does exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
