package ARRAYS;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        boolean isSorted = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }


    }
}