import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discount, bookPrice, amountPrice;
        String bookCategory, day;
        int totalBook;
        
        System.out.println("what day you buy this book?");
        day = sc.nextLine();
        System.out.println("input your book category : ");
        bookCategory = sc.nextLine();
        System.out.println("input your total book : ");
        totalBook = sc.nextInt();
       

        if (day.equalsIgnoreCase("wednesday") ) {
          if (bookCategory.equalsIgnoreCase("dictionary") || bookCategory.equalsIgnoreCase("novel")) {
            if (bookCategory.equalsIgnoreCase("dictionary")) {
                  if (totalBook > 2 ) {
                        System.out.println("you got 10% and 2% discount");
                  } else if (totalBook <= 2 && totalBook > 0) {
                        System.out.println("you got 10% discount");
                  } else {
                        System.out.println("you didn't buy any book");
                  }
            } else if (bookCategory.equalsIgnoreCase("novel")) {
                if (totalBook > 3) {
                        System.out.println("you got 7% + 2% discount");
                }  else if (totalBook <= 3 && totalBook > 0 ) {
                        System.out.println("you got 7% + 1% discount");
                }  else {
                        System.out.println("you didn't buy any book");
                }
            }
      } else if (totalBook > 3) {
            System.out.println("you got 5% discount");
      } else if (totalBook > 0 && totalBook <= 3) {
            System.out.println("you didn't get a discount");
      } else {
            System.out.println("data not found");
      }
 } else {
      System.out.println("you didn't get any discount today");
 }
}
}