public class Dosenn extends Pegawai{
    public String nidn;
    
    public Dosenn(String nip, String nama, String nidn){
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayIndo(){
        super.displayInfo();
        System.out.println("NIDN  : " + nidn);
    }

    public void mengajar(){
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

}
