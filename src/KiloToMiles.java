import java.util.Scanner;

public class KiloToMiles{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a distnace in kilometer : ");
        double km = scn.nextDouble();
        double miles = km * 0.621371;

        System.out.println("Your distance is : "+ miles + " miles.");
    }
}