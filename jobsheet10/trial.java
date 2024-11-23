import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        String name, next;
        int row, column, option;

        System.out.println("------ Welcome to Cinemaxx ------");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("What do you need today (1-3): ");
            option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); 

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("your seat is not avalaible. please enter a valid row (1-4) and column (1-2).");
                            System.out.print("enter row : ");
                            row = sc.nextInt();
                            System.out.print("enter coloumn : ");
                            column = sc.nextInt();
                            if (row > 0 || row < 5 || column > 0 || column < 3) {
                                audience[row - 1][column - 1] = name;
                                System.out.println("your booking is successfull!");
                                
                            } else if (row < 1 || row > 4 || column < 1 || column > 2) {
                                System.out.println("your seat is not avalaible. please enter a valid row (1-4) and column (1-2).");
                            } 
                            System.out.print("Are there any other audiences to be added? (y/n): ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("n")) {
                                break; 
                            }   
                            
                  
                        } else if (audience[row - 1][column - 1] != null) {
                            System.out.println("The selected seat is already occupied by another audience. please enter again");
                            System.out.print("enter row : ");
                            row = sc.nextInt();
                            System.out.print("enter coloumn : ");
                            column = sc.nextInt();
                            if (audience[row - 1][column - 1] != null) {
                                audience[row - 1][column - 1] = name;
                                System.out.println("your booking is successfull!");
                            }
                            System.out.print("Are there any other audiences to be added? (y/n): ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("n")) {
                                break; 
                            }   
                            
                        } else {
                            audience[row - 1][column - 1] = name;
                            System.out.println("Your booking is successful!");
                        }

 
                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break; 
                        }
                    }
                    break;

                case 2:
                 
                    System.out.println("\nAudience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t");
                            }else {
                                System.out.print(audience[i][j] + "\t");
                            }
                          
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                   
                    System.out.println("Exiting the program. Thank you!");
                   

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}