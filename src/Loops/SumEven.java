package Loops;

import java.util.Scanner;

public class SumEven {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.println("sum is : " + sum);

    }
}