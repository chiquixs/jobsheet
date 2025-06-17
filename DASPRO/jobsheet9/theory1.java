import java.util.Scanner;

public class theory1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month [] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int key;

        System.out.println("input number");
        key = sc.nextInt();

        for (int i = 0; i < month.length; i++) {
            if (i == key) {
                i = key - 1;
                System.out.println(month[i]);
                break;
              
            } 
           
        }

        // int array [];
        // array = new int[10];
        // int key;

        // for (int i = 0; i < array.length; i++) {
        //     System.out.print("input variable : ");
        //     array[i] = sc.nextInt();
        // } 

        // System.out.print("input number you want to check : ");
        // key = sc.nextInt();

        // for (int i = 0; i < array.length; i++) {
        //     if (key == array[i]) {
        //         i = array[i] + 1;
        //         System.out.print("your number is on index " + i);
                
        //     }
           
        // }






    }
    
}