package Loops;

public class SumTable {
    public static void main(String[] args) {
        // using table of 8 here

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += n*i;
        }
        System.out.println("Sum of table 8 : " + sum);
    }
}