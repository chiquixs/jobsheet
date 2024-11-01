import java.util.Scanner;
public class WhileMultiples18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;
        double average;

        System.out.print("input the multiple : ");
        multiple = input.nextInt();

        // for (int i = 1; i <= 50; i++) {
        //     if (i % multiple == 0) {
        //         sum = sum + i;
        //         counter++;
        //     }
        // }
        int i = 1;
        while (i <= 50) {
            sum = sum + i;
            counter++;
            i++;
        } 
        average = (double) sum / counter ;
        System.out.printf("there are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("the sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        System.out.println("the average value is : " + average);
    }
}