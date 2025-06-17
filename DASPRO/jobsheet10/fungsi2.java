import java.util.Scanner;

public class fungsi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num1;
       int num2;
       int result = 0;

       System.out.println("input no 1 ");
       num1 = sc.nextInt();
       System.out.println("num2 ");
       num2 = sc.nextInt();

       for(int i = 0; i < num2; i++){
            result += num1;
       }
       System.out.println(result);
       
    }

    
    
}