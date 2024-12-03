import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class assignment2 {

    static String fruit[] = {"Apple","Orange","Grape","Kiwi","Guava"};

    static void fruitSold(int fruitPlace[][]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fruit.length; i++){
            System.out.println("how many " + fruit[i] + " sold : " );
            for (int j = 0; j < 7; j++){
                System.out.print("day " + (j+1) + " : ");
                fruitPlace[i][j] = sc.nextInt();            
            }
        }
    }

    static void displayFruit(int display[][]){
        for (int i = 0; i < fruit.length; i++){
            System.out.print(fruit[i] + " \t:\t");
            for (int j = 0; j < 7; j++){
                System.out.print(display[i][j] + " \t");
            }
            System.out.println();
        }
    }

    static int biggestFruit(){
        for (int i = 0; i < fruit.length; i++){
            for (int j = 0; j < 7; j++){
                biggest = 
            }
        }
    }
    public static void main(String[] args) {
        int placeFix[][] = new int[fruit.length][7];
        fruitSold(placeFix);
        displayFruit(placeFix);
    }
}