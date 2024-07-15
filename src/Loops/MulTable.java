package Loops;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println("table of number " +n+ " is : ");
        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " * " + i +" = " + n*i);

        }
    }
}