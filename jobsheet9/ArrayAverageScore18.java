import java.util.Scanner;

public class ArrayAverageScore18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        double total1 = 0, total2 = 0;
        double average1, avarage2;
        int totalPassed = 0, totalFailed = 0;
        int student;

        System.out.print("enter the number of student : ");
        student = sc.nextInt();
 

        for (int i = 0; i < score.length; i++) {
            System.out.print("enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                total1 += score[i];
                totalPassed += 1;
                
            } else if (score[i] < 70) {
                total2 += score[i];
                totalFailed += 1;
            }

        }
        average1 = total1 / totalPassed;
        avarage2 = total2 / totalFailed;

        System.out.println("The average score of student who passed is " + average1);
        System.out.print("The average score of student who failed is " + avarage2);
    }

}