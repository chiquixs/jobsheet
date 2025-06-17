import java.util.Scanner;
public class ArrayValue18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (finalScore[i] > 70) {
                System.out.println("student " + i + " passed!");
            } else {
                System.out.println("student " + i + " failed!");
            }
        }



    }
    
}
