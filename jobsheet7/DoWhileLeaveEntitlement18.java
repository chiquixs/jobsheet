import java.util.Scanner;
public class DoWhileLeaveEntitlement18 {
   
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 0, numLeave = 0;
        String confirmation;

        System.out.print("input the number of leave entitlment : ");
        leaveEntitlement = input.nextInt();
        
        do {
            System.out.print("do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("how many day (s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("remaining leave entitlement : " + leaveEntitlement);
                } else {
                    System.out.println("you dont have enough levae entitlement");
                    
                }
            } else {
                break;
            }
        } while (leaveEntitlement > 0);
    }  
}