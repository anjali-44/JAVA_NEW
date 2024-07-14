package Java_Practice_Program;
import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your marks of 3 subjects : ");
        float m1 = scn.nextFloat();
        float m2 = scn.nextFloat();
        float m3 = scn.nextFloat();

        float cgpa = (m1 + m2 + m3) / 30;
        System.out.println("CGPA is : " + cgpa);
    }
}