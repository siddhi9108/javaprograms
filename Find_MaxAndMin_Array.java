package javaapplication1;

import java.util.Arrays;

public class Find_MaxAndMin_Array {

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr = {6, -1, -2, -3, 0, 1, 2, 3, 4};
        //Arrays.sort(arr);
        //System.out.println("Minimum = " + arr[0]);
        //System.out.println("Maximum = " + arr[arr.length - 1]);
        int x = getMaxValue(arr);
        int y = getMinValue(arr);
        System.out.println(x);
        System.out.println(y);

    }
}
