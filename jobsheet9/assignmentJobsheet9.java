import java.util.Scanner;
public class assignmentJobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the index that you want: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int element;
        double sum = 0;
        int max, min;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + i + " element: ");
            element = sc.nextInt();
            array[i] = element; 
        }
   
        max = array[0];
        min = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
       
        double average = sum / array.length;

        System.out.println("The highest value is : " + max);
        System.out.println("The lowest value is : " + min);
        System.out.println("The average of value is : " + average);
    





    }
    
}