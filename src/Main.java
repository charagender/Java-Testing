import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // All lines must end with a semicolon

        byte Mario; // Mario has been declared. bytes only hold a single byte of data.
        short notme = 32767; // notme has been declared and assigned. AKA initialized. shorts are two bytes in size.
        int i = 2147483647; // ints are 4 bytes in size
        float notpi = 3.14f; // Floats use are only 1 byte precise and must end with an f after the number
        double supernotpi = 3.14159f; // Doubles are 2 bytes precise and can end with either nothing, an f, or a d
        boolean whoami = true; // Bools can only be either true and false. also lowercase
        char letter = 'e'; // chars only store a single character
        String name = "I am Ruby"; // Strings must be declared with a capital S and full quotation marks.
        String huh = null; // null is literally nothing

        Mario = 127; // Mario has been assigned the value 127

        String hello = "Hello World!";

        System.out.println(hello + ' ' + hello.length()); // You can combine multiple things in a string by using a +
        System.out.println(Mario);

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username?");
        String input = scanner.nextLine();

        System.out.println("Your username is: " + input); */


        int x = 100;
        int y = 20;

        System.out.println("x: " + x + "y: " + y);

        int result = x + y;
        System.out.println("x + y: " + result);

        result = x - y;
        System.out.println("x - y: " + result);

        result = x * y;
        System.out.println("x * y: " + result);

        result = x / y;
        System.out.println("x / y: " + result);

        result = 101 % 2; // If remainder is 0 then input is even else it is odd
        System.out.println("101 % 2: " + result);

        System.out.println("x++: " + (x++)); // This doesn't work in a println but this does exist
        x++; // it does exist
        System.out.println("x +=2: " + (x+= 2)); // There's also += -= *= /= and %= (wtf is that)

        System.out.println(Math.PI);


        boolean watchedMarioMovie = true;
        System.out.println("Have I watched the Mario Movie? " + watchedMarioMovie);

        int yourScore = 81;
        int passScore = 80;
        boolean passedClass = yourScore >= passScore;
        System.out.println("You passed: " + passedClass + " with " + yourScore + " points");

        boolean perfectScore = yourScore == 100; // = is assignment; == is comparison
        System.out.println("Do you have a perfect score? " + perfectScore);

        boolean failedClass = passedClass == false;
        failedClass = !passedClass; // ! is a logical negation. passedClass is being negated here

        boolean passedANDperfect = passedClass && perfectScore; // AND is &&
        boolean passedORperfect = passedClass || perfectScore; // OR is ||
        System.out.println("Passed and Perfect? " + passedANDperfect);
        System.out.println("Passed or Perfect? " + passedORperfect);
    }
}