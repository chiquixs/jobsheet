import java.util.Scanner;
public class LinearSearch18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[6];
        int key;
        int num;
        int index = 0;
        System.out.print("Enter the number of array elements : ");
        num = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
           System.out.print("Enter the array element " + i + " : " );
           arrayInt[i] = sc.nextInt();
           
        }
        
        System.out.print("Enter the key you want to search for : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (key == arrayInt[i]) {
                index = i;
                System.out.println("The key in the array is located at index position " + i);
            } else {
                System.out.println("Key not found");
                break;
            }          
        }   



    }
    
}