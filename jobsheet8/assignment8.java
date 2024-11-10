import java.util.Scanner;

public class assignment8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
             
                if (i == 1 || i == 5 || j == 1 || j == 5)  {
                    System.out.print(n + "  "); // replace 3 with your input number 
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}