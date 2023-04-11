import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        /* EXERCISE 1 */

        /*
         * CREATE A SIMPLE TRIVIA GAME
         *
         * Define (at least) three questions with three answers.
         * Prompt the User the type in their answer using the Scanner, you've seen in the output/input video
         * Then use if/else statements to check if the answer from the user is correct! And output that they were.
         * If they were wrong, tell the user and output the correct answer.
         *
         * BONUS: increment a points total each time the user is correct and at the end make a unique output for each
         * score the user might have (0 to 3)
         *
         * IMPORTANT TIPS:
         * 1. When reading in Strings from the user use scanner.next() (NOT scanner.nextLine())
         * 2. When you have an answer and input that are both strings you will have to use:
         *    userInput.equals(answer) instead of userInput == answer
         */

        Scanner scanner = new Scanner(System.in);
        int score = 0;


        System.out.println("What colour is the sky? ");
        String answer = scanner.next();
        if(answer.equals("blue")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry to break it to you, but the sky is blue...");
        }

        System.out.println("What can x² + 1 be factorized into?");
        answer = scanner.next();
        if(answer.equals("(x+1)(x-1)")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The answer is (x+1)(x-1), might want to work on your maths");
        }

        System.out.println("What does DNS stand for?");
        answer = scanner.next();
        if(answer.equals("DomainNameServer")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! DNS stands for Domain Name Server");
        }

        System.out.println("Trivia over! You got " + score + " points!");
        switch (score) {
            case 0: System.out.println("Ouch! Don't worry though! You can keep improving if you study!"); break;
            case 1: System.out.println("Good try! There are things that you don't always have to know, but a 5 " +
                    "minute search can do the job on answering any questions you might have!"); break;
            case 2: System.out.println("Well done! You're nearly there! Just study a little bit harder and you can get " +
                    "a perfect score!"); break;
            case 3: System.out.println("Impressive! You got a perfect score! You should be proud!"); break;
            default: System.out.println("What" + score); break;
        }

        /* Correct. For the most part.
         * The exercise asked to define 3 questions. I never defined them. I only asked them with println.
         */
    }
}
