public class Mahasiswa18 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

//constuctor 1
public Mahasiswa18(){
    
}

//constructor 2
public Mahasiswa18(String nim, String nama, String kelas, float ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;

}


public void cetakInfo(Mahasiswa18[] arrayOfMahasiswa){
    for(int i = 0; i < 3; i++){
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
        System.out.println("------------------------------------------");
    }
}
}
