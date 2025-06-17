// public class assignment {
//     static int number(int a){
      
//         while (a <= 100) {
//             a += 2;
//             if (a % 2 == 0) {
//                 System.out.println(a);
//             }
//         } 
//         return a;
//     }
//     static int total(){
//         int i = 0;
//         for(i = 0; i <= 100; i++){
//             if (i % 2 == 0) {
//                 i+=1;
//             } 
//         }
//         return i;
//     }

//    public static void main(String[] args) {
//     int hasil = number (0);
   
//     System.out.println(total());
//    }
    
// }
import java.util.Scanner;

public class Fru {

    static void fruitNum() {
        Scanner input = new Scanner(System.in);
        String[] fruits = {"apple", "orange", "grape", "kiwi", "guava"};
        int[][] place = new int[7][5]; // 7 days, 5 fruits

        for (int day = 0; day < 7; day++) {
            System.out.println("Day " + (day + 1));
            for (int fruitIndex = 0; fruitIndex < fruits.length; fruitIndex++) {
                System.out.print(fruits[fruitIndex] + " quantity: ");
                place[day][fruitIndex] = input.nextInt();
            }
        }

        // Optionally, print the collected data
        System.out.println("\nCollected Data:");
        for (int day = 0; day < 7; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            for (int fruitIndex = 0; fruitIndex < fruits.length; fruitIndex++) {
                System.out.print(fruits[fruitIndex] + ": " + place[day][fruitIndex] + " ");
            }
            System.out.println();
        }

        input.close(); // Close the scanner to prevent resource leak
    }

    public static void main(String[] args) {
        fruitNum(); // Call the method to execute
    }
}