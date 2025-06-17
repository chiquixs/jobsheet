import java.util.Scanner;
public class Star18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input number : ");
        int n = sc.nextInt();

        // //experiment 1
        // for (int i = 1; i <= n; i++) {
        //     System.out.print("*");
        // }

        // experiment 2
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        } 
            


    }
}