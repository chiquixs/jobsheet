import java.util.Scanner;
public class DosenDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen18[] arrayOfDosen = new Dosen18[3];

        for(int i = 0; i < arrayOfDosen.length; i++) {
            sc.nextLine();
            arrayOfDosen[i] = new Dosen18();
            System.out.println("Masukkan Data Dosen ke- " + (i+1));
            System.out.print("Kode                                                       : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama                                                       : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
            arrayOfDosen[i].jenisKelamin = sc.nextBoolean();
            System.out.print("Usia                                                       : ");
            arrayOfDosen[i].usia = sc.nextInt();
            System.out.println("----------------------------------------");

        }


        int no = 1;
        for(Dosen18 data : arrayOfDosen) {
            System.out.println("----MENAMPILKAN DATA DOSEN----");
            System.out.println("Data Dosen ke- " + no );
            System.out.println("Kode          : " + data.kode);
            System.out.println("Nama          : " + data.nama);
                if (data.jenisKelamin == true) {
                    System.out.println("Jenis Kelamin : Laki-Laki");
                } else if (data.jenisKelamin == false) {
                    System.out.println("Jenis Kelamin : Perempuan");
                } else {
                    System.out.println("invalid");
                }
            System.out.println("Usia          : " + data.usia);
            System.out.println("----------------------------------------");
            no++;
        }

        DataDosen18 data = new DataDosen18();
        data.dataSemuaDosen(arrayOfDosen);
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        data.rataRataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        data.infoDosenPalingTua(arrayOfDosen);
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        data.infoDosenPalingMuda(arrayOfDosen);
        

    }
}