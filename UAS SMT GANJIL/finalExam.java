import java.util.Scanner;

public class finalExam {

    static String[] listBook = {"Harry Potter", "Lord of The Ring", "The Alchemist", "Sherlock Holmes"};
    static String[] isbnList = {"978-3-16-148410-0", "978-1-843-56710-2", "978-0-06-231500-7", "978-1-566-19310-3"};
    static String[] availability = {"available","available","borrowed","available"};
    static String[] optional;
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------WELCOME TO THE LIBRARY-------");
        
        while (true) {
            System.out.println("THIS IS OUR MENU");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Please choose the Menu : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void displayBooks() {
        System.out.println("BOOK DISPLAY");
        for (int i = 0; i < listBook.length; i++) {
            System.out.println((i + 1) + ". " + listBook[i]+ "\t" + " - ISBN: " + isbnList[i] 
            + "Book Status : " + availability[i]);
        } System.out.println("\n");
    }

    static void borrowBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the book that you want to borrow: ");
        int borrow = sc.nextInt()-1; 

        if (borrow < 0 || borrow >= availability.length) {
            System.out.println("Invalid book number. Please try again.");
        }

        if (availability[borrow].equals("available")) {
            availability[borrow] = "borrowed"; 
            System.out.println("Your book is successfully borrowed : " + listBook[borrow] + "\n");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    static void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the book that you want to return : ");
        int returnBook = sc.nextInt()-1; 

        if (returnBook < 0 || returnBook >= availability.length) {
            System.out.println("Invalid book number, please try again");
        }

        if (availability[returnBook].equals("borrowed")) {
            availability[returnBook] = "available"; 
            System.out.println("Your book is successfully to return : " + listBook[returnBook] + "\n");
        } 
    }


}