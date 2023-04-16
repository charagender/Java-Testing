import java.util.Scanner;

public class Exercise2a {
    public static void main(String[] args) {
        /* EXERCISE 2  */

        /*
         * Exercise 2:
         * a) Re-create the Trivia Game from before. This time with 5 Questions & 5 Answers!
         *  Use Arrays to save the question and answers.
         *  Create at least two methods that make the code more readable and easier to follow.
         *    --> Hint: Duplicate code can usually be made into methods
         *  BONUS:  Use an endless while loop with if statements so the user can play until they don't want anymore.
         *
         * OPTIONAL HARDER EXERCISE (Without Solution):
         * b) Create a very simple version of Tik Tak Toe
         *  Hints: Use one array to save the board. Think about what type of data you need!
         *         Use methods to properly print out each row of the board.
         *         Make it a two Player Game (making an AI is too advanced :P)
         *         You will need to use Loops here as well!
         *
         */

        String questions[] = new String[5];
        questions[0] = "What colour is the sky?";
        questions[1] = "What does DNS stand for?";
        questions[2] = "How many states does the USA have?";
        questions[3] = "What is the capital of the United Kingdom?";
        questions[4] = "What is the chemical symbol for Iron?";

        String answers[] = new String[5];
        answers[0] = "Blue";
        answers[1] = "Domain Name Server";
        answers[2] = "50";
        answers[3] = "London";
        answers[4] = "Fe";

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int score = 0;

            for(int i = 0; i < 5; i++) {
                System.out.println(questions[i]);
                String input = scanner.nextLine();
                score = questionCheck(answers[i], input, score);
            }

            scorePrint(score);

            System.out.println("Do you wish to play again?");
            if(scanner.next().toLowerCase().equals("no")) {
                System.out.println("Thank you for playing");
                break;
            }
        }
    }

    public static void scorePrint(int score) {
        switch(score) {
            case 5: System.out.println("You are a genius! Everything correct!"); break;
            case 4: System.out.println("You are pretty smart. Only one mistake!"); break;
            case 3: System.out.println("You are okay. Made two mistakes. It can happen to anyone!"); break;
            case 2: System.out.println("You made three mistakes. That's okay, just keep studying!"); break;
            case 1: System.out.println("You made four mistakes. You can improve if you study hard enough!"); break;
            case 0: System.out.println("You... you got everything wrong!"); break;
            default: System.out.println("what"); break;
        }
    }

    public static int questionCheck(String questionAnswer, String questionInput, int score) {
        if(questionInput.toLowerCase()
                .equals(questionAnswer.toLowerCase())) {
            score++;
            System.out.println("Correct! Your score is now " + score);
        } else {
            System.out.println("Incorrect! The answer is: " + questionAnswer);
        }
        return score;
    }
}
