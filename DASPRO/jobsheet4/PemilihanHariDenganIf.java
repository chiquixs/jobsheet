import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.println("masukkan angka : ");
        angka = sc.nextInt();
        
        if (angka <= 5 ) {
            System.out.println("weekday");
        } else if (angka < 8) {
            System.out.println("weekend");   
        } else { 
            System.out.println("invalid number");
        }
    }
}
