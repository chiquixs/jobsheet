import java.util.ArrayList;
import java.util.List;

public class mahasiswa18 {
    String nama;
    String nim;
    String kelas;
    double ipk;

public mahasiswa18(){

}

public mahasiswa18(String nm, String nim, double ipk, String kls){
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}


void tampilkanInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("IPK : " + ipk);
    System.out.println("Kelas : " + kelas);

}

void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
}

void updateIPK(double ipkBaru){
    ipk = ipkBaru;
}

String nilaiKinerja(){
    if (ipk >= 0.0 && ipk <= 4.0) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    
    } else {
       return "ipk tidak valid";
    }
    
}
}