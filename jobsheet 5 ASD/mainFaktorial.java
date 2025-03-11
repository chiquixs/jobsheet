import java.util.Scanner;

public class mainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan Bf : " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC : " + fk.faktorialDC(nilai));
    }
}