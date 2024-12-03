import java.util.Scanner;
public class pracitcAssignment2 {

    static String student[];

    static void studentScore(int scorePlace[][], int numStudents, int numWeeks){
    Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numStudents; i++){
            System.out.print("enter the name of student " + (i+1) + " : ");
            student[i] = sc.nextLine();
            for(int j = 0; j < numWeeks; j++){
                System.out.print("input score for week " + (j+1) + " of " + student[i] + " : ");
                scorePlace[i][j] = sc.nextInt();
            }
            sc.nextLine();
        } 
    }

    static void displayScore(int scorePlace[][], int numStudents, int numWeeks){
        
        System.out.println("\nScores display : " );
        for (int i = 0; i < numStudents; i++) {
            System.out.print(student[i] + ": ");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(scorePlace[i][j] + " \t");
            }
            System.out.println();
        }

    }

    static int highestWeek(int scorePlace[][], int numStudents, int numWeeks){
        System.out.println("highest grade from all student");
        int weekSum[] = new int[numWeeks];

        
        for(int i = 0; i < numStudents; i++){
            for (int j = 0; j < numWeeks; j++){
                weekSum[j] += scorePlace[i][j];
            }
        }

        int maxSum = weekSum[0];
        int weekIndex = 0;

        for(int i = 1; i < weekSum.length; i++){
            if (weekSum[i] > maxSum) {
                maxSum = weekSum[i];
                weekIndex = i;
            }
        }       
        return weekIndex;
    }

    public static int findStudentWithHighestGrade(int[][] grades, int numStudents) {
        int highestTotalGrade = 0;
        int studentIndex = -1;

      
        for (int i = 0; i < numStudents; i++) {
            int totalGrade = 0;

            
            for (int j = 0; j < grades[i].length; j++) {
                totalGrade += grades[i][j];
            }

           
            if (totalGrade > highestTotalGrade) {
                highestTotalGrade = totalGrade;
                studentIndex = i; 
            }
        }

        return studentIndex; 
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter the number of weeks: ");
        int numWeeks = sc.nextInt();

        student = new String[numStudents];
        int[][] placeFix = new int[numStudents][numWeeks];


        sc.nextLine();
        studentScore(placeFix, numStudents, numWeeks);
        displayScore(placeFix, numStudents, numWeeks);
        
        int weekIndex = highestWeek(placeFix, numWeeks, numStudents);
        System.out.println("Week with the highest total score: Week " + (weekIndex + 1));

        int studentIndex = findStudentWithHighestGrade(placeFix, numStudents);
        System.out.println("Student with the highest total grade: " + student[studentIndex]);
        System.out.println("Grades for each week: ");
        for (int j = 0; j < numWeeks; j++) {
            System.out.println("Week " + (j + 1) + ": " + placeFix[studentIndex][j]);

        }
    }
    
}