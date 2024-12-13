import java.util.Scanner;

public class tryThis {

    static String customer[][] = new String[100][7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Add order list");
            System.out.println("2. Display all order list");
            System.out.println("3. Exit");
            System.out.print("Choose a menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    inputList();
                    break;
                case 2:
                    int grandTotal = calculateMenu(15000, 22000, 12000, 18000);
                    System.out.println("Total price: " + grandTotal);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    static void inputList() {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            for (int i = 0; i < customer.length; i++) {
                System.out.print("Enter customer name: ");
                customer[i][0] = sc.nextLine();
                System.out.print("Enter table number: ");
                int table = sc.nextInt();
                customer[i][1] = String.valueOf(table);

                System.out.println("=== MENU CAFE ===");
                System.out.println("1. Black coffee - Rp 15000");
                System.out.println("2. Latte - Rp 22000");
                System.out.println("3. Teh tarik - Rp 12000");
                System.out.println("4. Noodles - Rp 18000");

                int chooseMenu;
                while (true) {
                    System.out.print("Choose a menu (enter number of menu or enter 0 to finish): ");
                    chooseMenu = sc.nextInt();

                    if (chooseMenu == 0) {
                        System.out.println("Your order is successful!");
                        break;
                    }

                    switch (chooseMenu) {
                        case 1:
                            System.out.print("Enter number of black coffee: ");
                            int coffee = sc.nextInt();
                            customer[i][2] = String.valueOf(coffee);
                            break;
                        case 2:
                            System.out.print("Enter number of latte: ");
                            int latte = sc.nextInt();
                            customer[i][3] = String.valueOf(latte);
                            break;
                        case 3:
                            System.out.print("Enter number of teh tarik: ");
                            int teh = sc.nextInt();
                            customer[i][4] = String.valueOf(teh);
                            break;
                        case 4:
                            System.out.print("Enter number of noodles: ");
                            int noodles = sc.nextInt();
                            customer[i][5] = String.valueOf(noodles);
                            break;
                        default:
                            System.out.println("Menu not available, please enter again.");
                            break;
                    }
                }

                // Menanyakan apakah pengguna ingin memasukkan data pelanggan lain
                System.out.print("Do you want to add another customer? (yes/no): ");
                String response = sc.next();
                if (response.equalsIgnoreCase("no")) {
                    continueInput = false;
                    break;
                }
                sc.nextLine(); // Clear the buffer
            }
        }
    }

    static int calculateMenu(int icoffee, int ilatte, int iteh, int inoodles) {
        int allTotal = 0;
        for (int i = 0; i < customer.length; i++) {
            if (customer[i][2] != null) {
                int coffeeQuantity = Integer.parseInt(customer[i][2]);
                allTotal += icoffee * coffeeQuantity;
            }
            if (customer[i][3] != null) {
                int latteQuantity = Integer.parseInt(customer[i][3]);
                allTotal += ilatte * latteQuantity;
            }
            if (customer[i][4] != null) {
                int tehQuantity = Integer.parseInt(customer[i][4]);
                allTotal += iteh * tehQuantity;
            }
            if (customer[i][5] != null) {
                int noodlesQuantity = Integer.parseInt(customer[i][5]);
                allTotal += inoodles * noodlesQuantity;
            }
        }
        return allTotal;
    }
}