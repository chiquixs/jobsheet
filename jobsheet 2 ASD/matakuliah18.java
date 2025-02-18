import java.util.ArrayList;
import java.util.List;

public class matakuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

public matakuliah18(){

}
    
public matakuliah18(String codeMK, String name, int sks, int jam){
    kodeMK = codeMK;
    nama = name;
    this.sks = sks;
    jumlahJam = jam;
}

void tampilInformasi(){
    System.out.println("Kode Mata Kuliah : " + kodeMK);
    System.out.println("Nama : " + nama);
    System.out.println("SKS : " + sks);
    System.out.println("Jumlah jam : " + jumlahJam);
}

void ubahSks(int sksBaru){
    sks = sksBaru;
    System.out.println("sks berhasil dirubah ! ");
}

void tambahJam(int jamBaru){
    jumlahJam += jamBaru;
}

void kurangiJam(int jamKurang){
    if (jamKurang > jumlahJam) {
        System.out.println("");
        System.out.println("PENGURANGAN JAM MATKUL GAGAL!!!");
    } else {
        jumlahJam -= jamKurang;
    }
}
}