package javaapplication1;

import java.io.*;
import java.util.Date;

public class JavaApplication1 {

    public static void main(String[] args) {
        File f1 = new File("C:\\List files\\test.txt");
        //System.out.println(f1.getName());
        //System.out.println(f1.length());
        //System.out.println(f1.getPath());
        //System.out.println(f1.getParent());
        //System.out.println(f1.canRead());
        //System.out.println(f1.canWrite());
        //System.out.println(f1.canExecute());
        System.out.println(f1.isDirectory());
        //System.out.println(f1.isFile());
        //Date d = new Date(f1.lastModified());
        //System.out.println(d);

    }

}
