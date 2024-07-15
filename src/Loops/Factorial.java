package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int fact = 1;

//        for (int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
//        System.out.println("Factorial is : " + fact);
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Fact : "+ fact);

    }
}