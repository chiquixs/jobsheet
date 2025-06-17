import java.util.Scanner;
public class practicAssignment1 {

    static int areaCubes (int s){
        int area = (s * s) * 6;
        return area;
    }

    static int volumeCubes (int sl){
        int volume = (sl * sl * sl);
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("input side of cubes : ");
        int side = input.nextInt();

        int a = areaCubes(side);
        int v = volumeCubes(side);

        System.out.println("the area of cubes is " + a);
        System.out.println("the volume of cube is " + v);

    }
}