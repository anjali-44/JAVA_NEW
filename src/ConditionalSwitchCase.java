import java.util.Scanner;

public class ConditionalSwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int age = scn.nextInt();
//
//        switch (age) {
//            case 18 :
//                System.out.println("going to become an adult");
//                break;
//            case 23 :
//                System.out.println("Get s job");
//                break;
//            case 60 :
//                System.out.println("get retired");
//                break;
//            default :
//                System.out.println("Enjoy your life");
//        }

        // Practice programs :

        // 1.
        int a = 10;
        if (a==11) {
            System.out.println("i am 11");
        }
        else {
            System.out.println("I am not 11");
        }

        // 2. to find pass or fail
        // require atleast total 40 % and 33% in each subject

        System.out.println("Enter the maximum marks : ");
        float totalMarks = scn.nextInt();

        System.out.println("Enter marks of each of three subjects : ");

        int sub1 = scn.nextInt();
        int sub2 = scn.nextInt();
        int sub3 = scn.nextInt();

        float totalPct = (sub1 + sub2 + sub3)*100/(3*totalMarks);

        double passPct = 0.33 * totalMarks;

        if (sub1 >= passPct && sub2 >= passPct && sub3 >= passPct) {
            if (totalPct >= 40) {
                System.out.println("Congratulations, you passed with : " + totalPct + "%");

            }
            else {
                System.out.println("You failed, your total % is : " + totalPct + "%");
            }
        }
        else {
            System.out.println("You failed to get minimum marks in particular subject(s)");
        }

        // 3. tax calculation :

        System.out.println("Enter your Salary in LPA : ");
        double salary = scn.nextDouble();
        double tax;

        if (salary < 2.5) {
            System.out.println("No tax applicable.");
        }
        else if (salary >= 2.5 || salary < 5) {
            tax = 0.05*salary*100000;
            System.out.println("tax is : " + tax);
        }
        else if (salary >= 5 || salary < 10) {
            tax = 0.2*salary*100000;
            System.out.println("tax is : " + tax);
        }
        else {
            tax = 0.3*salary*100000;
            System.out.println("tax is : " + tax);
        }

        // 4. finding day of week using number by switch case

        System.out.println("Enter a number between 1 and 7 : ");
        int num = scn.nextInt();

        switch (num) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;

        }

        // 5. finding leap year :




        // 6. Find out the type of website :
        // .com --> commercial
        // .org --> organizational
        // .in --> indian website

        String website = scn.next();
        if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("Organizatinal website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        }



    }
}