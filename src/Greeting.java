import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter your name : ");
        String str = scn.nextLine();

        System.out.println("Hello, " + str + ". Nice to mee you!!");
    }
}