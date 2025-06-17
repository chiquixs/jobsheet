import java.util.Scanner;
public class PowerRecursive18 {

   

    static int calcullatePower(int base, int pow){
        if (pow == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(base);
            System.out.print("x");
            return base * calcullatePower(base, pow - 1);
            
        }
        
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input base number : ");
    int base = input.nextInt();
    System.out.print("input power number : ");
    int power = input.nextInt();

    System.out.println(" result of " + base + " power " + " = " + calcullatePower(base, power));
    }
    
   
}