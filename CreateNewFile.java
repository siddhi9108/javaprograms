//Create new file
package javaapplication1;

import java.io.*;
import java.util.Date;

public class CreateNewFile {

    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\List files\\test1.txt");
        //File f1=new File("C:\\List files\\dir1");

        if (f1.exists()) {
            System.out.println("File exists");
        } else {
            //f1.mkdir();
            f1.createNewFile();
            System.out.println("File created!!");
        }
    }

}

