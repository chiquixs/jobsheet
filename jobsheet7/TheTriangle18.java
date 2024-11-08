import java.util.Scanner;
public class TheTriangle18 {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int numInput, i = 0;
        // String s = " ";

        // System.out.print("input some number : ");
        // numInput = input.nextInt();

        // while (i < numInput) {
        //     s -= "* ";
        //     System.out.println(s);
        //     i--;
        // }

        for (int i = 0; i < 4; i++) {
           for (int j = 0; j <= i; j++)
            System.out.print("*");
        }
        System.out.println(" ");
    }
}