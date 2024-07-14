package ARRAYS;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float[] arr = new float[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextFloat();
        }
        System.out.println("Sum of array elements is : ");

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);

    }
}