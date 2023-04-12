import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // All lines must end with a semicolon

//        The basics! These are the available data types in Java
        byte Mario; // Mario has been declared. bytes only hold a single byte of data.
        short notme = 32767; // notme has been declared and assigned. AKA initialized. shorts are two bytes in size.
        int FarLands = 2147483647; // ints are 4 bytes in size
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


//        You can use so-called Scanners to take inputs from the CLI
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username?");
        String input = scanner.nextLine();

        System.out.println("Your username is: " + input); */


//        These are the available operators in Java
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


//        Booleans!
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


//        String manipulation!
        String sentence = "This is a sentence";
        System.out.println(sentence);
        System.out.println("The length of sentence is: " + sentence.length()); // This is called concatenation

//        Uppercase and Lowercase methods
        System.out.println("Uppercase method: " + sentence.toUpperCase());
        System.out.println("Lowercase method: " + sentence.toLowerCase());

//        You can also find the index of a word in a string with the .indexOf() method
        System.out.println("The word 'is' is at index: " + sentence.indexOf("is"));

//        You may also replace things within a String with others with the .replace() method
        System.out.println(sentence.replace("sentence", "String"));

//        It is also possible to check whether a string is empty or not with the .isEmpty() method
        String s = "";
        System.out.println("Is 's' empty? " + s.isEmpty());

//        You can also check if a String .startsWith("") or .endsWith("")
        System.out.println("Does 'sentence' start with 'T'? " + sentence.startsWith("T"));
        System.out.println("Does 'sentence' start with 'I'? " + sentence.endsWith("I"));

//        Does a String .contains("") ?
        System.out.println("Does 'sentence' contain 'sentence'? " + sentence.contains("sentence"));

//        Also possible to get the char at position n with .charAt(n)
        System.out.println("The char at position '8' of 'sentence is: " + sentence.charAt(8));

//        You can also remove every char before index 'n' of a string with .substring(n)
        System.out.println("The substring of 'sentence' starting at '12' is: " + sentence.substring(12));


//        Casting! (data type conversion)
        int loan = 750;
        float interestRate = 0.0525f;

//        If two data types collide, the biggest data type is applied over everything else
        float interest = loan * interestRate; // in this case, loan is implicitly converted to a float
        System.out.println("The interest is: " + interest);

//        If you convert a float or a double to an int, everything after the 0 is cut off
        int interest2 = loan * (int)interestRate;
        System.out.println("interestRate cast as int: " + interest2);


//        Ternary operator!
        int exam = 65;
        int gift = 0;

        if(exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println("gift is: " + gift);

        /* A ternary '?' operator is essentially a compact if-else. first you make a condition. then the ternary
         * operator, then the return value if true, then the return value if false */
        gift = (exam >= 50) ? 10 : 0;
        System.out.println("gift is: " + gift);


//        Arrays!

        /* To declare an array, you must add brackets to the declaration, and the add = new dataType[n]; with n being
         * the size of the array. Note that sizes start at 1! */
        String[] questions = new String[4];

//        To set the value of an index 'n' in the array, do arrayName[n] = value;. Note that indexes start at 0!
        questions[0] = "How many states does the USA have?";
        questions[1] = "What is the capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";
        questions[3] = "How old is Ewan McGregor (in 2021?)";

//        You can also get the index 'n' of an array the same way
        System.out.println("questions[0] is: " + questions[0]);

        String[] answers = new String[4];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";
        answers[3] = "50";

        System.out.println("answers[0] is: " + answers[0]);

//        ArrayIndexOutOfBoundsException (Uncomment line below)
//        System.out.println(answers[answers.length + 1]); // get the index of answers, length of the array, + 1


//        Loops!

        /* For loops repeat and increment the size of 'i' until 'i' is less (or greater than!) n.
        * They are created with the keyword for, then a parenthesis, then initializing an int, then setting the
        * condition for the loop to end, which in this case is 'i' being greater than 100, and then setting 'i' to
        * increment or decrement at the end of each loop. Don't forget to add the curly brackets!
        * Here, the value of 'i' will be printed 100 times, because 'i' starts at 0, and stops after the 99th loop */

        /* for(int i = 0; i < 100; i++) {
            System.out.println(i);
        } */

//        You can also call methods to define the limiting number for 'i'
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        /* It is also possible to define a for loop so the variable gets set to the 'i'th element of an array
         * by using for(dataType variable : array) */
        for(String question : questions) {
            System.out.println(question);
        }

        /* A while loop while repeat infinitely until its condition is met. This differs from a regular for loop
         * because it does not automatically increment a variable after each loop, and its condition is not
         * necessarily attached to a variable. */

//        Scanner scanner = new Scanner(System.in);

//        Here, you can make an infinite loop by doing while(true)
        /* while(true) {
            System.out.println("Do you want to continue?");
            // Note that unless something like this is done, the input has to exactly match "yes" for it to be true
            if(scanner.next().toLowerCase().equals("yes")) {
                continue; // continue; simply jumps to the start of the next loop
            } else {
                break; // break; forcefully exits the loop to the first line of code outside the loop
            }
        } */

    }
}