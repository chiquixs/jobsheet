import java.util.Scanner;
public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        System.out.print("masukkan nama : ");
        nama = sc.nextLine();
        
        long NIM;
        System.out.print("masukkan NIM : ");
        NIM = sc.nextLong();

        char kelas;
        System.out.print("masukkan kelas : ");
        kelas = sc.next().charAt(0);

        int absen;
        System.out.print("masukkan no absen : ");
        absen = sc.nextInt();

        double nilaiAkhir;
        char nilaiAkhirHuruf;
        String kualifikasi;

        int nilaiKuis, nilaiTugas, nilaiUjian;
        System.out.print("masukkan nilai kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("masukkan nilai tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("masukkan nilai ujian : ");
        nilaiUjian = sc.nextInt();

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + NIM + ") " + " kelas " +  kelas  +  
        " nomor absen " + absen );

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("nilai akhir : " + nilaiAkhir);
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("nilai akhir huruf : A");
            System.out.println("kualifikasi : Sangat baik");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("nilai akhir huruf B+");
            System.out.println("kualifikasi : Lebih dari baik ");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("nilai akhir huruf B");
            System.out.println("kualifikasi : Baik ");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65 ) {
            System.out.println("nilai akhir huruf C+");
            System.out.println("kualifikasi : Lebih dari cukup ");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("nilai akhir huruf C ");
            System.out.println("kualifikasi : Cukup ");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50 ) {
            System.out.println("nilai akhir huruf D");
            System.out.println("kualifikasi : Kurang ");
        } else if (nilaiAkhir <= 39) {
            System.out.println("nilai akhir huruf E");
            System.out.println("kualifikasi : Gagal ");
        }
    }
}
