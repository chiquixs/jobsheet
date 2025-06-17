import java.util.Scanner;

public class assignment {

    // static void DescendingSequenceRecursive(int n) {
    //     if (n == 0) {          
    //         System.out.println(n); 
    //         return;
    //     } else {
    //         System.out.print(n);
    //         int a = n-1;
    //         DescendingSequenceRecursive(a);
    //     }
    // }

    // static int summationRecursive(int n){
        
    //     if (n==9) {         
    //         return 0;
    //     } else {     
    //         if (n == 8) {
    //             System.out.print ( n + "=");
    //         } else {
    //             System.out.print(n + "+");
    //         }       
    //     return n + (summationRecursive(n+1));
    //     }       
    // }

    static boolean isPrime(int n, int j) {
        if (n < 2) {
            return false;
        }
     
        if (j * j > n) {
            return true;
        }
       
        if (n % j == 0) {
            return false;
        }
      
        return isPrime(n, j + 1);
    }

    public static void main(String[] args) {
        // DescendingSequenceRecursive(5);
        // System.out.println(summationRecursive(1)); 
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Start checking from the first divisor
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
       
    }
    
}