import java.util.Scanner;

public class theory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answerQuestion[][];
        answerQuestion = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("person " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("question " + (j + 1) + " rate is : ");
                answerQuestion[i][j] = sc.nextInt();

            }
        }

        System.out.println("Survey Results:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Respondent : " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(answerQuestion[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Average value for each respondent:");
        for (int i = 0; i < 10; i++) {
            double respondentAverage = 0;
            for (int j = 0; j < 6; j++) {
                respondentAverage += answerQuestion[i][j];
            }
            respondentAverage /= 6;
            System.out.println("Respondent : " + (i + 1) + " " + respondentAverage);
        }

        System.out.println("Average value for each question:");
        for (int j = 0; j < 6; j++) {
            double questionAverage = 0;
            for (int i = 0; i < 10; i++) {
                questionAverage += answerQuestion[i][j];
            }
            questionAverage /= 10;
            System.out.println("Question : " + (j + 1) + " " + questionAverage);
        }

        double overallAverage = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                overallAverage += answerQuestion[i][j];
            }
        }

        overallAverage /= (10 * 6);
        System.out.println("Overall Average: " + overallAverage);

    }

}