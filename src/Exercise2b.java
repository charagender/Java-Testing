import java.util.Arrays;
import java.util.Scanner;

public class Exercise2b {
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

        String[][] Board = new String[3][3];

        while(true) {
            Board[0][0] = " ";        Board[0][1] = " ";        Board[0][2] = " ";
            Board[1][0] = " ";        Board[1][1] = " ";        Board[1][2] = " ";
            Board[2][0] = " ";        Board[2][1] = " ";        Board[2][2] = " ";

            boolean isOver = false;

            System.out.println("Welcome to Tic Tac Toe");

            printBoard(Board);
            System.out.println("Player 1: X         Player 2: O");

            while(isOver = false) {
                Board = makeMove(Board, 1, false);
                Board = makeMove(Board, 2, false);
                printBoard(Board);
                is
            }

        }

    }

    public static void printBoard(String[][] Board) {
        System.out.println(Arrays.deepToString(Board[0]));
        System.out.println(Arrays.deepToString(Board[1]));
        System.out.println(Arrays.deepToString(Board[2]));
    }

    public static String[][] makeMove(String[][] Board, int player, boolean isValid) {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];
        String playerChar = null;

        while(isValid == false) {
            playerChar = player == 1 ? "X" : "O";

            System.out.println("Player " + player + ", the X coordinate of your move");
            move[0] = scanner.nextInt() - 1;
            System.out.println("Player " + player + ", the Y coordinate of your move");
            move[1] = scanner.nextInt() - 1;

            isValid = Board[move[0]][move[1]].equals(" ");
        }
        Board[move[1]][move[0]] = playerChar;
        return Board;
    }

    public static boolean isGameOver(String[][] Board) {
        for (int i = 0; i < 3; i++) {
            String currentChar = Board[i][i];
            if(currentChar.equals(Board[i][i++]) && !currentChar.equals(" ")) {
                i--;
            }
        }
        return true;
    }
}
