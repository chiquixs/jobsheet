package sistemBengkel;

public class Motor extends Kendaraan{

    private String machine;
    private int serviceCharge = 250000;

    public Motor(String noPlat, String merk, int year, String type, String machine){
        super(noPlat, merk, year, type);
        this.machine = machine;
    }

    public String getMachine(){
        return machine;
    }

    public String totalPrice(int serviceCharge){
        String info = "Biaya Servis        : " + serviceCharge;
        return info;
    }

    public String totalPrice(int serviceCharge, int carWashCharge){
        String info = "Biaya Servis + Cuci : " + (serviceCharge + carWashCharge);
        return info;
    }

    public String showInfo(){
        String info = "";
        info += "No Plat : " + getNoPlat() + "\n";
        info += "Merk    : " + getMerk() + "\n";
        info += "Tahun   : " + getYear() + "\n";
        info += "Jenis   : " + getType() + "\n";
        info += "Biaya Servis        : " + serviceCharge + "\n";
        info += "Biata Servis + Cuci : " + (serviceCharge + 50000);

        return info;
    }
}