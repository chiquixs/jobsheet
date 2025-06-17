public class DataDosen18 {
    
    public void dataSemuaDosen(Dosen18[] arrayOfDosen){
        System.out.println("===MENAMPILKAN DATA SEMUA DOSEN===");
        for(int i = 0; i < arrayOfDosen.length; i++){
            System.out.println("Data Dose ke- " + (i+1));
            System.out.println("Kode : " + arrayOfDosen[i].kode);
            System.out.println("Nama : " + arrayOfDosen[i].nama);
            if (arrayOfDosen[i].jenisKelamin == true) {
                System.out.println("Jenis Kelamin : Laki-Laki");
            } else if (arrayOfDosen[i].jenisKelamin == false) {
                System.out.println("Jenis Kelamin : Perempuan");
            } else {
                System.out.println("invalid");
                }
            System.out.println("Usia  : " + arrayOfDosen[i].usia);
            System.out.println("----------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen){
        int lakiLaki = 0;
        int perempuan = 0;

        for(int i = 0; i < arrayOfDosen.length; i++){
            if (arrayOfDosen[i].jenisKelamin == true) {
                lakiLaki++;
            } else if (arrayOfDosen[i].jenisKelamin == false) {
                perempuan++;
            }
                
        }
        System.out.println("===MENAMPILKAN JUMLAH DOSEN PER KELAMIN===");
        System.out.println("Jumlah Dosen Laki Laki : " + lakiLaki);
        System.out.println("Jumlah Dosen Perempuan : " + perempuan);
    }

    public void rataRataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen){
        int rataRataUsiaLakiLaki = 0;
        int rataRataUsiaPrerempuan = 0;
        int lakiLaki = 0;
        int perempuan = 0;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if (arrayOfDosen[i].jenisKelamin == true) {
                rataRataUsiaLakiLaki += arrayOfDosen[i].usia;
                lakiLaki++;
            } else if (arrayOfDosen[i].jenisKelamin == false) {
                rataRataUsiaPrerempuan += arrayOfDosen[i].usia;
                perempuan++;
            }
        }
        int rataRataAkhirLaki = rataRataUsiaLakiLaki / lakiLaki;
        int rataRataAkhirPerempuan = rataRataUsiaPrerempuan / perempuan;

        System.out.println("===MENAMPILKAN RATA-RATA USIA DOSEN PER KELAMIN===");
        System.out.println("Rata-rata Usia Dosen Laki-Laki : " + rataRataAkhirLaki);
        System.out.println("Rata-rata Usia Dosen Perempuan : " + rataRataAkhirPerempuan);
    }

    public void infoDosenPalingTua(Dosen18[] arrayOfDosen){
        int index = 0;
        int max = 0;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if (arrayOfDosen[i].usia > max) {
                max = arrayOfDosen[i].usia;
                index = i;
            }

        }
        System.out.println("===MENAMPILKAN DATA DOSEN PALING TUA===");
        System.out.println("Kode            : " + arrayOfDosen[index].kode);
        System.out.println("Nama            : " + arrayOfDosen[index].nama);
        if (arrayOfDosen[index].jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Laki-Laki");
        } else if (arrayOfDosen[index].jenisKelamin == false) {
            System.out.println("Jenis Kelamin : Perempuan");
        }
        System.out.println("Jenis Kelamin : " + arrayOfDosen[index].usia);
    }

    public void infoDosenPalingMuda(Dosen18[] arrayOfDosen){
        int index = 0;
        int min = 100;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if (arrayOfDosen[i].usia < min) {
                min = arrayOfDosen[i].usia;
                index = i;
            }

        }
        System.out.println("===MENAMPILKAN DATA DOSEN PALING MUDA===");
        System.out.println("Kode            : " + arrayOfDosen[index].kode);
        System.out.println("Nama            : " + arrayOfDosen[index].nama);
        if (arrayOfDosen[index].jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Laki-Laki");
        } else if (arrayOfDosen[index].jenisKelamin == false) {
            System.out.println("Jenis Kelamin : Perempuan");
        }
        System.out.println("Jenis Kelamin : " + arrayOfDosen[index].usia);
    }

    
    
}