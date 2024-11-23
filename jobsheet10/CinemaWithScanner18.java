import java.util.Scanner;
public class CinemaWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        String name, next;
        int row, coloumn, option;

        System.out.println("------welcome to cinemaxx------");
        System.out.println("please enter your identity and seat");


        while (true) {
        System.out.println("Menu:");
        System.out.println("1. Input audience data");
        System.out.println("2. Show audience list");
        System.out.println("3. Exit");
        System.out.print("what do you need today (1-3): ");
        option = sc.nextInt();
        sc.nextLine(); 

        switch (option) {
            case 1:     
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++){
                        System.out.print("enter a name : ");
                        name = sc.nextLine();
                        System.out.print("enter row number : ");
                        row = sc.nextInt();
                        System.out.print("enter coloumn number : ");
                        coloumn = sc.nextInt();
                        System.out.println("are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();

                        if (row < 1 || row > 4 || coloumn < 1 || coloumn > 2) {
                            System.out.println("please enter row from 0-4 and coloumn from 0-2");
                        } else if (audience[row - 1][coloumn - 1] != null) {
                            System.out.println("he selected seat is already occupied by other audiences");
                        } else {
                            audience[row - 1][coloumn - 1] = name;
                            System.out.println("your booking is success!");

                            System.out.println("are there any audience to be added? (y/n) : ");
                            next = sc.nextLine();

                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        
                    
                        }
                    }
                
                }
       
                break;
            }

            case 2 : 
            System.out.println(" Audience List:");
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    String seat = audience[i][j] != null ? audience[i][j] : "Empty";
                    System.out.printf("Row %d, Column %d: %s%n", i + 1, j + 1, seat);
                }
            }
            break;

            case 3:
                    
                    System.out.println("Exiting the program. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");







        }
    }
    
}