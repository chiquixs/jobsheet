import java.util.Scanner;
public class AverageValue18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i , j;
        float score, totalScore = 0, averageScore;

        i = 1;
        while (i <= 5) {
            totalScore = 0;
            System.out.println("input score of student " + i);
            for (j = 1; j <= 5; j++) {
                
                System.out.print("score " + j + " : ");
                score = sc.nextInt();
                totalScore += score;
            }
            averageScore = totalScore / 5;
            i++;
            System.out.print("the average score of student is " + averageScore);
            System.out.println(" ");
        }
    }
}