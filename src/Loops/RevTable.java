package Loops;

import java.util.Scanner;

public class RevTable {
    public static void main(String[] args) {
        // printing reverse table of 10 :

        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}