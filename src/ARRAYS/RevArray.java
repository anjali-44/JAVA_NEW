package ARRAYS;

import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Array in reverse order is : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}