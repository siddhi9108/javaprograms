package javaapplication1;

import java.util.*;

public class Generate_Rows_Columns {

    public static void main(String[] args) {
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        row = ob.nextInt();
        System.out.println("Enter no. of colums");
        col = ob.nextInt();
        System.out.print("Enter " + (row * col) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = ob.nextInt();
            }
        }
        System.out.print("The Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
