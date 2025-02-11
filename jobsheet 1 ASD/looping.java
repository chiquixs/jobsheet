import java.util.Scanner;

public class looping {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan NIM : ");
    String nim = sc.nextLine();

    if (nim.length() <= 12) {
        String lastTwoDigits = nim.substring(10, 12); // Ambil dua digit terakhir
        int n = Integer.parseInt(lastTwoDigits); // Konversi ke integer

        System.out.println("Dua digit terakhir dari NIM: " + lastTwoDigits);
        System.out.print("n = " + n);
    
    if (n < 10) {
        n += 10;
    }

    for (int i = 0; i <= 12; i++ ){
        if (i == 6 || i == 10) {
            System.out.print("*");
        } else if (i % 2 != 0) {
            System.out.print("*");
        } else {
            System.out.print(i);
        }
    }

}   

    }
}