import java.util.Scanner;
public class assignmentt7 {
    public static void main(String[] args) {
       

        Scanner input = new Scanner(System.in);
        String buy;
        int totalTicket = 0; 
        double netPrice = 0, ticketPrice = 50000, firstPrice, secondPrice;
        int tiketPembeli;

        do {
            System.out.print("do you want to buy ticket? (y/n) : ");
            buy = input.nextLine();

           
            if(buy.equalsIgnoreCase("y") == false) {
                break;
            }
            
       
            System.out.print("how many ticket that you want: ");
            tiketPembeli = input.nextInt();
        
         
            if (tiketPembeli > 4 && tiketPembeli < 10) {
                firstPrice = (tiketPembeli * ticketPrice); 
                secondPrice = ((tiketPembeli * ticketPrice) * 0.1); 
                netPrice += firstPrice - secondPrice; 
                totalTicket += tiketPembeli;
            } else if (tiketPembeli > 10) {
                firstPrice = (tiketPembeli * ticketPrice); 
                secondPrice = ((tiketPembeli * ticketPrice) * 0.15);                
                netPrice += firstPrice - secondPrice;                         
                totalTicket += tiketPembeli;
            } else {
                netPrice += (tiketPembeli * ticketPrice);                               
                totalTicket += tiketPembeli;
            }
            input.nextLine();
        } while (true);

        System.out.println("total ticket today is : " + totalTicket );
        System.out.println("today's income is : " + netPrice);


    }
}
