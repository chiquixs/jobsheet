import java.util.Scanner;
public class Selection2Exp318 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String category, anotherString;
        int income, netSalary;
        double tax = 0;

        System.out.println("input category = ");
        category = input18.nextLine();
        System.out.println("input income = ");
        income = input18.nextInt();

        if(category.equals("worker")) {
            if (income <= 2000000) {
                tax = 0.1;
            } else if (income <= 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }   netSalary = (int) (income - (tax*income));
                System.out.println("nett salary = " + netSalary);
             
        } else if (category.equals("businessman")){
            if (income <= 2500000) {
                tax = 0.15;
            } else if (income <= 3500000) {
                tax = 0.2;
            } else { 
                tax = 0.25;
            }   netSalary = (int) (income - (tax*income));
                System.out.println("nett salary = " + netSalary);
         } else {
            System.out.println("invalid");
        }

        }            
}