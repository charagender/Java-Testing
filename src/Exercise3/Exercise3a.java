package Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3a {
    public static void main(String[] args) {
        /*
         * Exercise 3:
         * a) Trivia Game with CLASSES and Objects:
         * Modify the Trivia Game we have made in the previous two exercises in such a way to use Classes as well.
         * Imagine possible making custom classes for Question Answer Pairs, using Lists to save them
         *
         *
         */
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What colour is the sky?", "blue"));
        questions.add(new Question("What does DNS stand for?", "Domain Name Server"));
        questions.add(new Question("How many states does the USA have?", "50"));
        questions.add(new Question("What is the capital of the United Kingdom?", "London"));
        questions.add(new Question("What is the chemical symbol for Iron?", "Fe"));

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int score = 0;
            String input = "";

            for(int i = 0; i < 5; i++) {
                System.out.println(questions.get(i).getPrompt());
                input = scanner.nextLine();
                score = questionCheck(questions.get(i).getAnswer(), input, score);
            }

            scorePrint(score);

            System.out.println("Do you wish to play again?");

            if(scanner.next().equalsIgnoreCase("no")) {
                System.out.println("Thank you for playing");
                break;
            }
        }
    }

    public static int questionCheck(String correct, String input, int score) {
        if(input.equalsIgnoreCase(correct)) {
            score++;
            System.out.println("Correct! Your score is now " + score);
        } else {
            System.out.println("Wrong! The answer is " + correct);
        }
        return score;
    }

    public static void scorePrint(int score) {
        switch (score) {
            case 5 -> System.out.println("You are a genius! Everything correct!");
            case 4 -> System.out.println("You are pretty smart. Only one mistake!");
            case 3 -> System.out.println("You are okay. Made two mistakes. It can happen to anyone!");
            case 2 -> System.out.println("You made three mistakes. That's okay, just keep studying!");
            case 1 -> System.out.println("You made four mistakes. You can improve if you study hard enough!");
            case 0 -> System.out.println("You... you got everything wrong!");
            default -> System.out.println("what");
        }
    }
}
