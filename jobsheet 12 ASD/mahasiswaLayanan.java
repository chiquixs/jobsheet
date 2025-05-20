public class mahasiswaLayanan {

    String nim;
    String nama;
    String prodi;
    String keperluan;

    public mahasiswaLayanan(String nim, String nama, String prodi, String keperluan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.keperluan = keperluan;
    }

    public String toString(){
        return nama + "\t" + nim + "\t" + prodi + "\t" + keperluan;
        
    }
}