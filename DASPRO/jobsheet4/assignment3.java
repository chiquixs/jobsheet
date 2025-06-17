import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String brand, category;
    int size;

    System.out.println("what brand do you buy : ");
    brand = sc.nextLine();
    System.out.println("what category do you buy of this brand : ");
    category = sc.nextLine(); 
    System.out.println("enter the size : ");
    size = sc.nextInt();
        
    if (brand.equalsIgnoreCase("converse")) {
        if (category.equalsIgnoreCase("slip on")) {
            if (size <= 40) {
                if (size >= 36) {
                    System.out.println("your amount is Rp.800.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
            
        } else if (category.equalsIgnoreCase("high top")) {
            if (size <= 44) {
                if (size >= 40) {
                    System.out.println("your amount is Rp.1.200.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
        }
    } else if (brand.equalsIgnoreCase("sketcher")) {
        if (category.equalsIgnoreCase("woman")) {
            if (size <= 41) {
                if (size >= 36) {
                    System.out.println("your amount is Rp.1.000.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
        } else if (category.equalsIgnoreCase("man")) {
            if (size <= 44) {
                if (size >= 41) {
                    System.out.println("your amount is Rp.1.800.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
        }
    } else if (brand.equalsIgnoreCase("nike")) {
        if (category.equalsIgnoreCase("kids")) {
            if (size <= 40) {
                if (size >= 36) {
                    System.out.println("your amount is Rp.750.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
        } else if (category.equalsIgnoreCase("adult")) {
            if (size <= 44) {
                if (size >= 40) {
                    System.out.println("your amount is Rp.1.500.000");
                } else {
                    System.out.println("not found data");
                }
            } else {
                System.out.println("not found data");
            }
        }
    } else {
        System.out.println("invalid");
    }
}
} 