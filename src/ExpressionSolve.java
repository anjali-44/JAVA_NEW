import java.util.Scanner;

public class ExpressionSolve {
    public static void main(String[] args) {
//        int a = 7 / 4 * 9 / 2;

//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);

        // problem 2 grade converter

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // decrpt -->
        grade = (char)(grade - 8);
        System.out.println(grade);

        // problem 3 --> checking a user enter number grater than a given number

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println(a > 8);


    }
}