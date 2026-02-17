package sistemBengkel;

public class Kendaraan {

    private String noPlat;
    private String merk;
    private int year;
    private String type;

    public Kendaraan(String noPlat, String merk, int year, String type){
        this.noPlat = noPlat;
        this.merk = merk;
        this.year = year;
        this.type = type;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String showInfo(){
        String info = "";
        info += "No Plat : " + noPlat + "\n";
        info += "Merk    : " + merk + "\n";
        info += "Tahun   : " + year + "\n";
        info += "Jenis   : " + type;
        
        return info;
    }
}