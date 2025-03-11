import java.util.Scanner;

public class mainSum{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen : ");
    int elemen = sc.nextInt();

    sum sm = new sum(elemen);
    for(int i = 0; i < elemen; i++){
        System.out.print("masukkan keuntungan ke- " + (i + 1) + " :");
        sm.keuntungan[i] = sc.nextDouble();
    }

    System.out.println("Total keuntungan menggunakan bruteforce : " + sm.totalBF());
    System.err.println("Total keuntungan menggunakan Divide dan conquer : " + sm.totalDC(sm.keuntungan, 0, elemen-1));

    
    }
}