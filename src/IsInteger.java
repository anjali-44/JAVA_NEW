import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scn = new Scanner(System.in);

        // int num = scn.nextInt();
        System.out.println("The number is integer : " + scn.hasNextInt());
    }
}