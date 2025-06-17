import java.util.Scanner;
public class selection2Exp218 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int angle1, angle2, angle3, totalAngle;
        System.out.println("enter for angle 1 : ");
        angle1 = input18.nextInt();
        System.out.println("enter for angle 2 : ");
        angle2 = input18.nextInt();
        System.out.println("enter for angle 3 : ");
        angle3 = input18.nextInt();

        totalAngle = angle1 + angle2 + angle3;
        if (totalAngle == 180 ) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("right triangle");
            } else if (angle1 == angle2 && angle1 == angle3) {
                System.out.println("equilateral triangle");
            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("isosceles triangle");
            }
        } else {
            System.out.println("not a triangle");
        }








    }
}