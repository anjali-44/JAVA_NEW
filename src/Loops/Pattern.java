package Loops;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        for (int i = 0; i < n ;i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int n = scn.nextInt();

        int nst = n;

        for (int i = 1; i <= n; i++) {
            for (int st = n; st >= nst; st--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}