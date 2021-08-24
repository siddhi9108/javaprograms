//Read the content of file using FileReader
package javaapplication1;

import java.io.*;

public class Read_Using_FR {

    public static void main(String[] args) throws Exception {

        FileReader fin = new FileReader("C:\\List files\\test2.txt");
        int x;
        do {
            x = fin.read();
            if (x != -1) {
                System.out.print((char) x);
            }
        } while (x != -1);
        fin.close();
    }

}
