import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int num1, num2, num3;
       System.out.println("enter first number : ");
       num1 = sc.nextInt();
       System.out.println("enter second number : ");
       num2 = sc.nextInt();
       System.out.println("enter third number : ");
       num3 = sc.nextInt();

        
    if (num1 > num2) {
            if (num1 > num3) {
        System.out.println("number 1 is maximum number");  
          } else {
        System.out.println("number 3 is maximum number");
          }  
        
    } else if (num2 > num3) {
        System.out.println("number 2 is maximum number");
    } else {
        System.out.println("number 3 is maximum number");
    }
    }
}