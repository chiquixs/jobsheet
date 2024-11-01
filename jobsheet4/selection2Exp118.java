import java.util.Scanner;
public class selection2Exp118 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int year;
        System.out.println("input year : ");
        year = input18.nextInt();

        if (year%4 == 0) {
            if (year%100 != 0 ) {
                System.out.println("leap year");
            } else if (year%400 == 0) {
                System.out.println("leap year");
            } else if (year%100 == 0) {
                System.out.println("not a leap year");
            }
        } else 
            System.out.println("invalid data");









    }
}