public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar(){
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar){
        this.jenisLayar = jenisLayar;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment){
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement){
        volume += decrement;
    }

    public String getInfo(){
        String info = "";
        info += "Jenis Layar    : " + this.jenisLayar + "\n";
        info += "Volume TV      : " + this.volume + "\n";
        info += "Harga TV       : " + this.getHarga() + "\n";
        info += "Warna TV       : " + this.getWarna() + "\n";
        info += "Merk TV        : " + this.getMerk();

        return info;
    }
}
