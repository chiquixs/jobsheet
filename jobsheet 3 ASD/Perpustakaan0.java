// public class Mahasiswa18 {

//     public String nim;
//     public String nama;
//     public String kelas;
//     public float ipk;

// //constuctor 1
// public Mahasiswa18(){
    
// }

// //constructor 2
// public Mahasiswa18(String nim, String nama, String kelas, float ipk) {
//     this.nim = nim;
//     this.nama = nama;
//     this.kelas = kelas;
//     this.ipk = ipk;

// }


// public void cetakInfo(Mahasiswa18[] arrayOfMahasiswa){
//     for(int i = 0; i < 3; i++){
//         System.out.println("Data Mahasiswa ke-" + (i + 1));
//         System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
//         System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
//         System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
//         System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
//         System.out.println("------------------------------------------");
//     }
// }
// }

import java.util.Scanner;

class Buku {
    String kode, judul, penulis;
    boolean dipinjam = false; // Status apakah buku sudah dipinjam
    String peminjam = null; // Nama mahasiswa yang meminjam buku

    public Buku(String kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
    }
}

class Mahasiswa {
    String nim, nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}

public class Perpustakaan0 {
    static Scanner sc = new Scanner(System.in);
    static Buku[] arrayOfBuku = new Buku[100];
    static Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[100];
    static int jumlahBuku = 0, jumlahMahasiswa = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Tampilkan Peminjaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (menu) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tambahMahasiswa();
                    break;
                case 3:
                    pinjamBuku();
                    break;
                case 4:
                    tampilkanPeminjaman();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tambahBuku() {
        System.out.print("Masukkan kode buku: ");
        String kode = sc.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();
        System.out.print("Masukkan penulis: ");
        String penulis = sc.nextLine();
        
        arrayOfBuku[jumlahBuku++] = new Buku(kode, judul, penulis);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public static void tambahMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();
        
        arrayOfMahasiswa[jumlahMahasiswa++] = new Mahasiswa(nim, nama);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public static void pinjamBuku() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kode buku: ");
        String kode = sc.nextLine();

        // Mencari mahasiswa berdasarkan NIM
        Mahasiswa peminjam = null;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (arrayOfMahasiswa[i].nim.equals(nim)) {
                peminjam = arrayOfMahasiswa[i];
                break;
            }
        }
        if (peminjam == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }

        // Mencari buku berdasarkan kode
        for (int i = 0; i < jumlahBuku; i++) {
            if (arrayOfBuku[i].kode.equals(kode)) {
                if (!arrayOfBuku[i].dipinjam) {
                    arrayOfBuku[i].dipinjam = true;
                    arrayOfBuku[i].peminjam = peminjam.nama;
                    System.out.println(peminjam.nama + " berhasil meminjam " + arrayOfBuku[i].judul);
                } else {
                    System.out.println("Gagal meminjam buku: " + arrayOfBuku[i].judul + " karena sudah dipinjam oleh " + arrayOfBuku[i].peminjam);
                }
                return;
            }
        }

        System.out.println("Buku tidak ditemukan!");
    }

    public static void tampilkanPeminjaman() {
        System.out.println("Daftar Peminjaman Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            if (arrayOfBuku[i].dipinjam) {
                System.out.println(arrayOfBuku[i].peminjam + " meminjam: " + arrayOfBuku[i].judul);
            }
        }
    }
}
