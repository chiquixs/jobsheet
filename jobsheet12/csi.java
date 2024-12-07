import java.util.Scanner;

public class csi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("input l : ");
        // int l = sc.nextInt();
        // System.out.println("input t : ");
        // int t = sc.nextInt();

        // int art[][] = new int[l][t];

        // for(int i = 0; i < l; i++){
        //     for (int j = 0; j < t; j++){
        //             System.out.println("p ");
        //             art[i][j] = sc.nextInt();
                    
        //     }
           

        // }
        // for(int i = 0; i < art.length; i++){
        //     for (int j = 0; j < t; j++){
        //         System.out.print(art[i][j] + " ");
        //     }
        //     System.out.println();

        // }

    //     System.out.println("input number of student : ");
    //     int student = sc.nextInt();
    //     sc.nextLine();
    //     System.out.println("input the test : ");
    //     int test = sc.nextInt();
    //     sc.nextLine();

    //     int[][] studentScore = new int[student][test];
    //     String name [] = new String[student];

    //     for (int i = 0; i < student; i++){
            
    //         System.out.println("input the name of student " + (i+1) + " ");
    //         name[i] = sc.nextLine();
    //         sc.nextLine();
    //         for (int j = 0; j < test; j++){
    //             System.out.println("input the score of student " + name[i] + " : ");
    //             studentScore[i][j] = sc.nextInt();
    //         }
    //     }

    //     for (int i = 0; i < student; i++){
    //         for (int j = 0; i < test; j++){
    //             System.out.print(studentScore[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    //    for (int i = 0; i < test; i++){
    //         int average = 0;
    //         int result;
    //         for (int j = 0; j < student; j++){
    //             average += studentScore[i][j];
                
                
    //         }
    //         result = average/student;
    //         System.out.println(result);
    //    }

            
            System.out.println("Input number of students: ");
            int student = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            System.out.println("Input the number of tests: ");
            int test = sc.nextInt();
            sc.nextLine(); // Consume the newline character
    
            int[][] studentScore = new int[student][test];
            String[] name = new String[student];
    
            for (int i = 0; i < student; i++) {
                System.out.println("Input the name of student " + (i + 1) + ": ");
                name[i] = sc.nextLine(); // Read the student's name
                
                for (int j = 0; j < test; j++) {
                    System.out.println("Input the score of student " + name[i] + ": ");
                    studentScore[i][j] = sc.nextInt(); // Read the student's score
                }
                sc.nextLine(); // Consume the newline character after the last score input
            }
    
            // Print the scores
            for (int i = 0; i < student; i++) {
                for (int j = 0; j < test; j++) {
                    System.out.print(studentScore[i][j] + " ");
                }
                System.out.println();
            }
    
            // Calculate and print the average score for each test
            for (int i = 0; i < test; i++) {
                int average = 0;
                for (int j = 0; j < student; j++) {
                    average += studentScore[j][i]; // Corrected indexing
                }
                int result = average / student; // Integer division
                System.out.println("Average score for test " + (i + 1) + ": " + result);
            }
    
            sc.close(); // Close the scanner
        
    


    }
}
