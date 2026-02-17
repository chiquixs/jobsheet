public class Kulkas extends AlatElektronik{
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public String getInfo(){
        String info = "";
        info += "Jumlah Pintu   : " + this.jumlahPintu + "\n";
        info += "Harga Kulkas   : " + this.getHarga() + "\n";
        info += "Warna Kulkas   : " + this.getWarna() + "\n";
        info += "Merk Kulkas    : " + this.getMerk();

        return info;
    }
}
