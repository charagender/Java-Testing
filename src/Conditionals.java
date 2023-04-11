import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        int exam1 = 31;
        int exam2 = 51;

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Results for exam 1: ");
        exam1 = scanner.nextInt();
        System.out.println("Results for exam 2: ");
        exam2 = scanner.nextInt(); */

        if (exam1 >= 50) {
            System.out.println("You have passed exam 1");
        } else {
            System.out.println("You have failed exam 1");
        }

        if (exam2 >= 50) {
            System.out.println("You have passed exam 2");
        } else if(exam2 < 0) {
            System.out.println("how did u do that"); // You can chain if statements
        } else {
            System.out.println("You have failed exam 2");
        }

        if(exam1 >= 50 && exam2 >= 50) {
            System.out.println("You have passed both exams!");
        }


        int medalPlacement = 1;

        switch (medalPlacement) {
            case 1: System.out.println("Gold medal!"); break;
            case 2: System.out.println("Silver medal!"); break;
            case 3: System.out.println("Bronze medal!"); break;
            default: System.out.println("No medal :("); break;
        }
    }
}
