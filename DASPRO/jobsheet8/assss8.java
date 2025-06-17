import java.util.Scanner;

public class assss8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numSports, numPolytechnics, numAthlete, athleteName;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("where did your polytechnic come from : ");
            numPolytechnics = sc.nextLine();

            for (int j = 0; j < 4; j++) {
                System.out.print("enter the sports : ");
                numSports = sc.nextLine();

                for (int k = 0; k < 5; k++) {
                    System.out.print("enter athlete " + (k+1) + " name : " );
                    athleteName = sc.nextLine();
                }
            }
        }
    }
}