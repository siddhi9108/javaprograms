package javaapplication2;

import java.io.*;
import java.util.Date;

public class CountNoOfFilesAndFolders {

    public static void main(String[] args) {

        File f1 = new File("D:\\test");
        int filecount = 0, dircount = 0;
        File[] arr = f1.listFiles();
        for (File file : arr) {

            if (file.isFile()) {
                //System.out.println("File" + f1.getName());
                filecount++;
            } else {
                //System.out.println("Dir" + f1.getName())
                dircount++;

            }

        }
        System.out.println("no. of files" + filecount);
        System.out.println("no. of dir" + dircount);
    }
}
