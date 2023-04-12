public class Methods {
    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "How many states does the USA have?";
        questions[1] = "What is the capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

//        This will call the function with the parameters, 2, questions array, and answers array
        outputQuestionsAndAnswersXTimes(2, questions, answers);

        System.out.println("The sum of 10 and 12 is: " + sum(10, 12));
    }


    /* void means that when the method is called, the code will be executed and nothing will be returned.
     * The things between the parenthesis are the parameters that will be passed to the function */
    public static void outputQuestionsAndAnswersXTimes(int amountOfOutputs, String[] questions, String[] answers) {

//        This for loop will use all the parameters we've passed onto the method
        for(int i = 0; i < amountOfOutputs; i++) {
            outputQuestionsAndAnswers(questions, answers);
        }
    }


    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        for(int j = 0; j < questions.length; j++) {
            System.out.println(questions[j]);
            System.out.println(answers[j]);
        }
    }


//    int here means that this method will return an int
    public static int sum(int x, int y) {
        return x + y;
    }
}
