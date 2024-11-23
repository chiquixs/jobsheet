import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        int[][] surveyResults = new int[10][6]; 
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter responses for Respondent " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                int response;
                do {
                    System.out.print("question " + (j + 1) + " : ");
                    response = scanner.nextInt();
                } while (response < 1 || response > 5); 
                surveyResults[i][j] = response;
            }
        }

    
        System.out.println("\nSurvey Results:");
        for (int i = 0; i < surveyResults.length; i++) {
            System.out.print("Respondent " + (i + 1) + ": ");
            for (int j = 0; j < surveyResults[i].length; j++) {
                System.out.print(surveyResults[i][j] + " ");
            }
            System.out.println();
        }
    

   
        System.out.println("\nAverage Value for Each Respondent:");
        for (int i = 0; i < surveyResults.length; i++) {
            double sum = 0;
            for (int j = 0; j < surveyResults[i].length; j++) {
                sum += surveyResults[i][j];
            }
            double average = sum / surveyResults[i].length;
            System.out.printf("Average for Respondent %d: %.2f%n", (i + 1), average);
        }
    

    
        System.out.println("\nAverage Value for Each Question:");
        for (int j = 0; j < surveyResults[0].length; j++) {
            double total = 0;
            for (int i = 0; i < surveyResults.length; i++) {
                total += surveyResults[i][j];
            }
            double average = total / surveyResults.length;
            System.out.printf("Average for Question %d: %.2f%n", (j + 1), average);
        }
    

   
        double totalSum = 0;
        int totalResponses = surveyResults.length * surveyResults[0].length;

        for (int i = 0; i < surveyResults.length; i++) {
            for (int j = 0; j < surveyResults[i].length; j++) {
                totalSum += surveyResults[i][j];
            }
        }

        double overallAverage = totalSum / totalResponses;
        System.out.printf("\nOverall Average: %.2f%n", overallAverage);
    }
}