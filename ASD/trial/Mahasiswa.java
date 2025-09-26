public class Mahasiswa {

    String nama;
    String nim;
    String kelas;
    int absen;
    
    public Mahasiswa(String nama, String nim, String kelas, int absen){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.absen = absen;
    }

    public void tampilInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("No Absen : " + absen);
    }
}