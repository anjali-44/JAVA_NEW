package ARRAYS;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        System.out.println("Enter the elements of matrix 1 of dimension 2x3 : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix 2 of dimension 2x3 : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        int[][] sum = new int[2][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The sum of the matrix is : " );

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}