//Read content of File using FileInputStream
package javaapplication1;

import java.io.*;

public class Read_Using_FIS {

    public static void main(String[] args) throws Exception {

        FileInputStream f1 = new FileInputStream("C:\\List files\\test.txt");

        int x;
        System.out.println(f1.available());
        do {
            x = f1.read();
            System.out.println((char) x);
        } while (x != -1);
        f1.close();
    }
}
