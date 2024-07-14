package ARRAYS;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the marks of students : ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = scn.nextInt();
        }
        System.out.println("Avg marks are : ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / 5.0f;
        System.out.println(avg);
    }
}