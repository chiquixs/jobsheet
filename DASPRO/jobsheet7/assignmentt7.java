import java.util.Scanner;
public class assignmentt7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int numInput;
        
        // System.out.print("input some number : ");
        // numInput = input.nextInt();
        
        // for (int i = numInput; i >= 1; i--) {           
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }  


        String buy;
        int totalTicket = 0; 
        double netPrice = 0, ticketPrice = 50000, firstPrice, secondPrice;
        int tiketBuy;

        do {
            System.out.print("do you want to buy ticket? (y/n) : ");
            buy = input.nextLine();

           
            if(buy.equalsIgnoreCase("y") == false) {
                break;
            }
            
       
            System.out.print("how many ticket that you want: ");
            tiketBuy = input.nextInt();
        
         
            if (tiketBuy > 4 && tiketBuy < 10) {
                firstPrice = (tiketBuy * ticketPrice); 
                secondPrice = ((tiketBuy * ticketPrice) * 0.1); 
                netPrice += firstPrice - secondPrice; 
                totalTicket += tiketBuy;
            } else if (tiketBuy > 10) {
                firstPrice = (tiketBuy * ticketPrice); 
                secondPrice = ((tiketBuy * ticketPrice) * 0.15);                
                netPrice += firstPrice - secondPrice;                         
                totalTicket += tiketBuy;
            } else if (tiketBuy > 0) {
                netPrice += (tiketBuy * ticketPrice);
                totalTicket += tiketBuy;
            }
                
            
            input.nextLine();
        } while (true);

        System.out.println("total ticket today is : " + totalTicket );
        System.out.println("today's income is : " + netPrice);


    }
}
