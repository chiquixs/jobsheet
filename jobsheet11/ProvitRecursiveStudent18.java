import java.util.Scanner;
public class ProvitRecursiveStudent18 {
    static double calculateProfit(double balance, int period){
        if (period == 0) {
            return balance;
        } else {
            return 1.11 * calculateProfit(balance, period - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input balance : ");
        double initialBalance = input.nextInt();
        System.out.println("input investment number : ");
        int investPeriod = input.nextInt();

        System.out.println("balance after " + initialBalance + " power " + " = " +
         calculateProfit(initialBalance, investPeriod));

    

        




    }
    
}