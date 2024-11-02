import java.util.Scanner;

public class assignment7 {
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
        
        int ticket = 0, totalTicket = 0;
        double priceTicket = 50.000, totalSales = 0.0, discount, firstPrice, netPrice;
        String buy;
        do {
            System.out.println("do you want to buy ticket? (y/n) : ");
            buy = input.nextLine();

            
            if (buy.equalsIgnoreCase("y") == (false) ) {
                break;
            }
                System.out.println("how many ticket you want to buy : ");
                ticket = input.nextInt();

                if (ticket > 4 && ticket <= 10) {
                    netPrice = (ticket * priceTicket) * 0.1;

                    totalSales += 
                    
                } else if (ticket > 10) {
                    discount = 0.15;
                } else {
                    continue;
                }
               
                
             

           
          System.out.printf("ticket sold : %d \nprice after discount : %.3f%n", ticketB, price3);
                
          System.out.printf("total ticket today : %d",totalTicket);
          System.out.printf("\ntotal sales of ticket today : %.3f%n", totalSales);  
    
    

        } while (true);
           
       



    }
}



// if (ticket > 4 && ticket <= 10) {
//     discount = 0.1;
// } else if (ticket > 10) {
//     discount = 0.15;
// } else {
   
// }
  
// price2 = (ticket * price1);
// price3 = price2 * discount;
// totalSales += price3;
// totalTicket += ticket;

// System.out.printf("ticket sold : %d \nprice after discount : %.3f%n", ticket, price3);
    
// System.out.printf("total ticket today : %d",totalTicket);
// System.out.printf("\ntotal sales of ticket today : %.3f%n", totalSales);  
