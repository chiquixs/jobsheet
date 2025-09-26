public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor : " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("================================");
    }

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public boolean isMesinOn(){
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int n){
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maximum kendaraan adalah 100");
            // kecepatan = 0;
        } else if (isMesinOn && kecepatan < 0) {
            System.out.println("Kecepatan tidak bole negatif!");
            // kecepatan = 0;
        }else {
            kecepatan = n;
        }
    }
    
}