import java.util.Scanner;
public class LayananPersetujuanKRS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPersetujuanKRS antrian = new AntrianPersetujuanKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademin ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Dua Antrian Terdepan");
            System.out.println("5. Lihat Antrian paling Akhir");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Jumlah Mahasiswa yang sudah Diproses");
            System.out.println("8. Jumlah Mahasiswa yang Belum Diproses atau Sisa dari 30 Kuota");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa : ");
                       for (Mahasiswa mahas : dilayani){
                        if (mahas != null) {
                            mahas.tampilkanData();
                        }
                       }
                    }
                    break;

                case 3:
                    antrian.tampilkanSemuaAntrian();
                    break;

                case 4: 
                    antrian.tampilkanDuaAntrianTerdepan();
                    break;

                case 5:
                    antrian.tampilkanAntrianPalingAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah Antrian Saat ini Adalah " + antrian.jumlahAntrian() + " Antrian");
                    break;
                
                case 7 :
                    System.out.println("Jumlah Mahasiswa yang Sudah Diproses ada " + antrian.jumlahProses());
                    break;

                case 8 :
                    System.out.println("Jumlah Mahasiswa yang Belum Diproses KRS : " + antrian.belumDiproses() + " Mahasiswa");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
            
        } while (pilihan != 0);
    }
    
    
}