package ARRAYS;

import java.util.Scanner;

public class FindInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        System.out.println("Enter the element you want to find : ");
        int n = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element "+ n + " is present at index " + i);
                break;
            }
        }
    }
}