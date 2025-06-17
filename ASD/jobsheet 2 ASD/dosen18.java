import java.util.ArrayList;
import java.util.List;

public class dosen18 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

public dosen18(){

}

public dosen18(String idDosen, String nama, boolean status, int tahun, String bidang){
    this.idDosen = idDosen;
    this.nama = nama;
    statusAktif = status;
    tahunBergabung = tahun;
    bidangKeahlian = bidang;
}

void tampilInformasi(){
    System.out.println("ID Dosen : " + idDosen);
    System.out.println("Nama : " + nama);
    System.out.println("Status Keaktifan : " + statusAktif);
    System.out.println("Tahun Bergabung " + tahunBergabung);
    System.out.println("Bidang Keahlian : " + bidangKeahlian);
}

void setStatusAktif(boolean status){
    if (statusAktif == status) {
        System.out.println("status anda sudah benar!!");
    }
    // } else {
    //     statusAktif = status;
    // }
}

int hitungMasaKerja(int thnSkrg){
    int hasilAkhir = thnSkrg - tahunBergabung;
    return hasilAkhir;
}

void ubahKeahlian(String bidang){
    bidangKeahlian = bidang;
}
}