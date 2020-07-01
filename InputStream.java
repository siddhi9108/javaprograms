package javaapplication2;

import java.io.*;
import java.util.Date;

public class InputStream {

    public static void main(String[] args) throws Exception {

        FileInputStream f1 = new FileInputStream("D:\\test\\demo,txt");
        int x;
        do {
            x = f1.read();
            System.out.println((Char(x)));

        } while (x != -1);
        f1.close();

    }
}
