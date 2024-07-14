import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        // 1. string to lowercase

        Scanner scn  = new Scanner(System.in);
//        System.out.println("Enter a string : ");
//        String str = scn.nextLine();
//        System.out.println("Your string in lowercase is :"+ str.toLowerCase());


        // 2. replace spaces with underscore

//        System.out.println("Enter string with spaces :");
//        String str = scn.nextLine();
//        System.out.println("string with replaced \' \' with _ :  " + str.replace(' ', '_'));
//
        String letter = "Dear <|name|>, Hello ";
        System.out.println("Enter your name : ");
        String str1 = scn.nextLine();
        System.out.println(letter.replace("<|name|>", str1));

        // 3. detect double and triple sequence characters

        String str = "This contains  and   triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        // 4. format the following letter using escape sequence

        String letter1 = "Dear Anjali, \nThis java course is good. \nThanks! ";
        System.out.println(letter1);
    }
}