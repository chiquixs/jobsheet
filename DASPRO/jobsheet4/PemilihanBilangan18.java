import java.util.Scanner;
public class PemilihanBilangan18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan sebuah angka :");
        int angka = sc.nextInt();

        String  jumlah = (angka % 2 == 0) ? ("termasuk bilangan genap") : ("termasuk bilangan ganjil");

        System.out.println(jumlah);
    }
}