import java.util.Scanner;

public class MainSPBU {
    public static void main(String[] args) {
        SistemSPBU spbu = new SistemSPBU();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=========== SISTEM SPBU ===========");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Tampilkan Antrian Kendaraan");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Mulai Melayani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = scanner.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = scanner.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = scanner.nextLine();
                    spbu.tambahKendaraanKeAntrian(platNomor, tipe, merk);
                    break;

                case 2:
                    spbu.tampilkanAntrian();
                    break;

                case 3:
                    spbu.jumlahAntrian();
                    break;

                case 4:
                    spbu.mulaiMelayaniKendaraan();
                    break;

                case 5:
                    spbu.tampilkanRiwayatTransaksi();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem SPBU!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 0-5.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}