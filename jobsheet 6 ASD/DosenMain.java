import java.util.Scanner;

public class DosenMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen listDosen = new DataDosen();

        for (int i = 0; i < 10; i++){
            System.out.println("Masukkan data dosen ke- " + (i+1));
            System.out.print("Kode    : ");
            String kode = sc.nextLine();
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk perempuan)  : ");
            Boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            
        

            Dosen allDosen = new Dosen(kode, nama, jenisKelamin, usia);
            listDosen.tambahDosen(allDosen);
            
        }
        
        System.out.println("Data dosen awal yang belum diurutkan : ");
        listDosen.tampil();

        System.out.println("Data dosen yang telah diurutkan berdasarkan usia termuda ke tertua dengan bubble sort :");
        listDosen.bubbleSort();
        listDosen.tampil();

        System.out.println("Data dosen yang telah diurutkan berdasarkan usia tertua ke termuda dengan selection sort : ");
        listDosen.SelectionSort();
        listDosen.tampil();

        System.out.println("Data dosen yang telah diurutkan berdasarkan usia tertua ke termuda dengan insertion sort : ");
        listDosen.InsertionSort();
        listDosen.tampil();

    }
}