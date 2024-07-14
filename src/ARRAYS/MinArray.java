package ARRAYS;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Minimum of the array : ");

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}