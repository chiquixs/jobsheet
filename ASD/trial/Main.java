import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        Stack riwayat = new Stack();
        

        while (true) {
            System.out.println("Masukkan Menu");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus sesuai NIM");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Hapus berdasarkan posisi");
            System.out.println("5. tampilkan berdasarkan absen tertentu");
            System.out.println("6. layani");
            System.out.println("7. mhs terdepan");
            System.out.println("8. mahasiswa yg sudah dilayani");
            System.out.println("9. kembalikan mahasiswa");
            System.out.println("Masukkan menu :");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan nim : ");
                    String nim = sc.nextLine();
                    System.out.println("Masukkan kelas : ");
                    String kelas = sc.nextLine();
                    System.out.println("Masukkan absen : ");
                    int absen = sc.nextInt();
                    sc.nextLine();

                    Mahasiswa m = new Mahasiswa (nama, nim, kelas, absen);
                    list.enqueue(m);
                    System.out.println("berhasil yeyy");
                    break;

                case 3:
                    list.tampilAntrian();
                    break;

                case 2:
                    System.out.println("Masukkan NIM yg ingin dihapus");
                    String hNIM = sc.nextLine();
                    if (list.hapus(hNIM)) {
                        System.out.println("yey berhasil dihapus");
                    } else {
                        System.out.println("cuihh gagal datae gaada");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan posisi yang ingin dihapus: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (list.hapusPosisi(pos)) {
                        System.out.println("Berhasil menghapus data di posisi " + pos);
                    } else {
                        System.out.println("Posisi tidak valid.");
                    }

                case 5:
                    System.out.print("Masukkan nomor absen yang ingin dicari: ");
                    int noAbsen = sc.nextInt();
                    sc.nextLine(); // Buat buang newline

                    Mahasiswa hasil = list.cariByAbsen(noAbsen);

                    if (hasil != null) {
                        System.out.println("Data Mahasiswa Ditemukan:");
                        System.out.println("Nama  : " + hasil.nama);
                        System.out.println("NIM   : " + hasil.nim);
                        System.out.println("Kelas : " + hasil.kelas);
                        System.out.println("Absen : " + hasil.absen);
                    } else {
                        System.out.println("Mahasiswa dengan absen " + noAbsen + " tidak ditemukan.");
                    }
                    break;

                case 6:
                    Mahasiswa dilayani = list.dequeue();
                    if (dilayani != null) {
                        riwayat.push(dilayani);
                        dilayani.tampilInfo();
                    }
                    break;

                case 7:
                    Mahasiswa terdepan = list.peek();
                    if (terdepan != null) {
                        terdepan.tampilInfo();
                    }
                    break;

                case 8:
                    riwayat.printStack();
                    break;

                case 9:
                    if (!riwayat.isEmpty()) {
                        Mahasiswa kembali = riwayat.pop();
                        list.enqueue(kembali);
                        System.out.println("Mahasiswa berhasil dikembalikan ke antrian:");
                        System.out.println("Nama  : " + kembali.nama);
                        System.out.println("NIM   : " + kembali.nim);
                        System.out.println("Kelas : " + kembali.kelas);
                        System.out.println("Absen : " + kembali.absen);
                    } else {
                        System.out.println("Tidak ada mahasiswa untuk dikembalikan.");
                    }
                    break;




            
                default:
                    break;
            }
        }
    }
}