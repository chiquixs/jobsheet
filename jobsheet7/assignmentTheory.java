import java.util.Scanner;
public class assignmentTheory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // // int totalHour = 0, studyHour = 0, day = 1;

        // // for (day = 1; day <=7; day++) {
        // //     boolean validInput;



        // // }

      

        // int totalHours = 0;

        // // Loop for each day of the week (7 days)
        // for (int day = 1; day <= 7; day++) {
        //     int hours = 0;
        //     boolean validInput = false;

        //     // Continue asking for input until a valid input is received
        //     while (!validInput) {
        //         System.out.print("Enter the number of hours studied on day " + day + ": ");
        //         hours = input.nextInt();

        //         // Check if the input is valid
        //         if (hours > 10) {
        //             System.out.println("Input is impossible. Please re-enter.");
        //         } else {
        //             validInput = true; // Valid input received
        //         }
        //     }

        //     // Add the valid hours to total hours
        //     totalHours += hours;
        // }

        // // Output the total study hours for the week
        // System.out.println("Total hours studied for the week: " + totalHours);
        
     
       
        
                System.out.print("Enter the number of employees: ");
                int numEmployees = scanner.nextInt();
        
                for (int i = 0; i < numEmployees; i++) {
                    System.out.print("Enter hours worked by employee " + (i + 1) + " (negative to stop): ");
                    double hoursWorked = scanner.nextDouble();
        
                    if (hoursWorked < 0) {
                        System.out.println("Negative hours entered. Stopping the program.");
                        break;
                    }
        
                    System.out.print("Enter daily salary for employee " + (i + 1) + ": ");
                    double dailySalary = scanner.nextDouble();
                    double bonus = calculateBonus(hoursWorked, dailySalary);
        
                    System.out.printf("Employee %d bonus: $%.2f%n", (i + 1), bonus);
                }
        
                scanner.close();
            }
        
            public static double calculateBonus(double hoursWorked, double dailySalary) {
                if (hoursWorked > 8) {
                    return 0.20 * dailySalary;
                } else {
                    return 0.0;
                }
            
        








    }
}
