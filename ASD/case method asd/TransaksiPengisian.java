public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public String toString() {
        return kendaraan.platNomor + ": Rp " + totalBayar;
    }
}