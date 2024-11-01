import java.util.Scanner;
public class individualTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rangeDistance;
        System.out.println("input your range : ");
        rangeDistance = sc.nextInt();

        if (rangeDistance <= 5) {
            System.out.println("use the melee weapon ");
        } else {
            System.out.println("use the ranged weapon ");
        }

    }
}
