public class Dosen{
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen(){

    }

    public Dosen(String kd, String nm, Boolean jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    public String getJenisKelaminAsString() {
        return jenisKelamin ? "Perempuan" : "Laki-laki";
    }

    public void tampilData(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + getJenisKelaminAsString());
        System.out.println("Usia : " + usia);
    }

    
}