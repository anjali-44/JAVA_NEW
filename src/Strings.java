import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = "Anjali";
        String a1 = new String("Sharma");

        System.out.println(str + ", " + a1);
        Scanner scn = new Scanner(System.in);

//        String str1 = scn.nextLine();
//        System.out.println(str1);
//
//        String str2 = scn.next();
//        System.out.println(str2);

        // STRING METHODS :

        System.out.println(str.length()); // to return the length of the string

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        // to trim the string

        String str3 = "      Anjali         ";
        System.out.println(str3.trim()); // return string with trimmed spaces

//        substring
        System.out.println(str.substring(2)); // return string starting from index 2 to the end
        System.out.println(str.substring(2, 5)); // to include end index too in this

        System.out.println("name.replace");

        System.out.println(str.replace('A', 'a'));

        System.out.println(str.replace("Anja", "aNJA"));

        System.out.println(str.startsWith("Anj"));
        System.out.println(str.endsWith("li"));

        System.out.println(str.charAt(2));

        System.out.println(str.indexOf('A')); // return first index
        System.out.println(str.indexOf('a', 2));

        System.out.println(str.lastIndexOf('a'));

        String stt = "anjaLi";
        System.out.println(str.equals(a1));
        System.out.println(str.equalsIgnoreCase(stt));

        // escape sequence characters

    }

}