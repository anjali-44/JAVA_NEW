package Java_Practice_Program;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to add : ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum is : " + sum);
    }
}