public class Mahasiswa18 {

    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa18(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}