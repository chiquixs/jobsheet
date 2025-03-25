import java.util.Scanner;

public class MahasiswaDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18(jumMhs);

        for (int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();

            System.out.print("IPK    : ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error! Masukkan angka IPK dengan format yang benar (contoh: 3.5)");
                sc.next();
            }
            double ipk = sc.nextDouble();
            sc.nextLine(); 
        

            Mahasiswa18 mahasiswa = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
            
        }
        // Mahasiswa18 m1 = new Mahasiswa18("123", "Zidan", "2A", 3.2);
        // Mahasiswa18 m2 = new Mahasiswa18("124", "Ayu", "2A", 3.5);
        // Mahasiswa18 m3 = new Mahasiswa18("125", "Sofi", "2A", 3.1);
        // Mahasiswa18 m4 = new Mahasiswa18("126", "Sita", "2A", 3.9);
        // Mahasiswa18 m5 = new Mahasiswa18("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("===========================================================");
        
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.SelectionSort();
        // list.tampil();

        // System.out.println("===========================================================");
        
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.InsertionSort();
        // list.tampil();

        //pencarian data sequential
        // System.out.println("-------------------------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("-------------------------------------------------------------");
        // System.out.println("Masukkkan IPK mahasiswa yang dicari : ");
        // System.out.print("IPK : ");
        // double cari = sc.nextDouble();

        // System.out.println("----menggunakan sequential searching----");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //pencarian data binary
        System.out.println("-------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Masukkkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("-------------------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}