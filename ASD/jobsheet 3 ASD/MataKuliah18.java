import java.util.Scanner;

public class MataKuliah18 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah18(){

    }

        public void tambahData(MataKuliah18[] arrayOfMataKuliah) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayOfMataKuliah.length; i++){
                sc.nextLine();
                if (arrayOfMataKuliah[i] == null) {
                    System.out.println("Masukkan Data Mata Kuliah Ke- " + (i+1));
                    System.out.print("Kode         : ");
                    kode = sc.nextLine();
                    System.out.print("Nama         : ");
                    nama = sc.nextLine();
                    System.out.print("SKS          : ");
                    sks = sc.nextInt();
                    System.out.print("Jumlah Jam   : ");
                    jumlahJam = sc.nextInt();
                    System.out.println("----------------------------------------");
                    

                    arrayOfMataKuliah[i] = new MataKuliah18(kode, nama, sks, jumlahJam);

                }
            }
        }
        
        
        public void cetakInfo(MataKuliah18[] arrayOfMataKuliah){
            for (int i = 0; i < arrayOfMataKuliah.length; i++){
                System.out.println("Data Mata Kuliah ke-" + (i+1));
                System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
                System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
                System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
                System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
                System.out.println("----------------------------------------");
            }
        
    }
}

