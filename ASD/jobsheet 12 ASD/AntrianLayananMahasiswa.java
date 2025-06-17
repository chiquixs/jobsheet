import java.util.Scanner;
public class AntrianLayananMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLayananMahasiswa antrean = new QueueLayananMahasiswa();
        int pilihan;
        do {
            System.out.println("======== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ========");
            System.out.println("1. Menambahkan Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Menampilkan Antrian Terdepan");
            System.out.println("4. Menampilkan Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Menampilkan Jumlah Mahasiswa yang Masih Mengantre");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("MASUKKAN DATA");
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    mahasiswaLayanan mhs = new mahasiswaLayanan(nim, nama, prodi, keperluan);
                    antrean.enqueue(mhs);
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;
                
                case 2:
                    mahasiswaLayanan dipanggil = antrean.dequeue();
                    if (dipanggil != null) {
                        System.out.println("Mahasiswa yang dipanggil : ");
                        System.out.println(dipanggil);
                    } else {
                        System.out.println("Antrian kosong");
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;

                case 3:
                    mahasiswaLayanan terdepan = antrean.peek();
                    if (terdepan != null) {
                        System.out.println("\n--- ANTRIAN TERDEPAN ---");
                        System.out.println(terdepan);
                    } else {
                        System.out.println("\nAntrian kosong!");
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;

                case 4:
                    mahasiswaLayanan terakhir = antrean.peekLast();
                    if (terakhir != null) {
                        System.out.println("\n--- ANTRIAN PALING AKHIR ---");
                        System.out.println(terakhir);
                    } else {
                        System.out.println("\nAntrian kosong!");
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("\n--- CEK ANTRIAN KOSONG ---");
                    if (antrean.isEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("\n--- CEK ANTRIAN PENUH ---");
                    System.out.println("Antrian berbasis Linked List tidak akan pernah penuh.");
                    System.out.println("Antrian dapat terus bertambah selama memori masih tersedia.");
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;
                
                case    7:
                    System.out.println("\n--- KOSONGKAN ANTRIAN ---");
                    antrean.clear();
                    System.out.println("Antrian berhasil dikosongkan!");
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;
                
                case    8:
                    System.out.println("\n--- JUMLAH MAHASISWA DALAM ANTRIAN ---");
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrean.size());
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" ");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

    }
}