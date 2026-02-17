public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getInfo(){
        String info = "";
        info += "Jenis Kipas    : " + this.jenis + "\n";
        info += "Harga Kipas    : " + this.getHarga() + "\n";
        info += "Warna Kipas    : " + this.getWarna() + "\n";
        info += "Merk Kipas     : " + this.getMerk();

        return info;
    }
}
