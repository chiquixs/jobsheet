package sistemBengkel;

public class Mobil extends Kendaraan{

    private String fuelOil;
    private int serviceCharge = 500000;
    private int carWashCharge = 50000;

    public Mobil(String noPlat, String merk, int year, String type, String fuelOil){
        super(noPlat, merk, year, type);
        this.fuelOil = fuelOil;
    }

    public String getFuelOil(){
        return fuelOil;
    }

    public void setFuelOil(String fuelOil){
        this.fuelOil = fuelOil;
    }

    // overloading cara 1
    public String totalPrice(int serviceCharge){
        String info = "Biaya Servis        : " + serviceCharge;
        return info;
    }

    public String totalPrice(int serviceCharge, int carWashCharge){
        String info = "Biaya Servis + Cuci : " + (serviceCharge + carWashCharge);
        return info;
    }

    // overloading cara 2
    public String totalPrice(){
        String info = " ";
        info += "Biaya Servis        : " + serviceCharge + "\n";
        info += "Biaya Servis + Cuci : " + carWashCharge;

        return info;
    }

    public int calculateTotal(){
        return serviceCharge + carWashCharge;
    }

    // overriding dengan method di kendaraan (show info)
    public String showInfo(){
        String info = "";
        info += "No Plat : " + getNoPlat() + "\n";
        info += "Merk    : " + getMerk() + "\n";
        info += "Tahun   : " + getYear() + "\n";
        info += "Jenis   : " + getType() + "\n";
        info += "Biaya Servis        : " + serviceCharge + "\n";
        info += "Biata Servis + Cuci : " + calculateTotal();

        return info;
    }
}