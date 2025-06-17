public class mataKuliahMain {

    public static void main(String[] args) {
        matakuliah18 mk1 = new matakuliah18();
        mk1.kodeMK = "by71";
        mk1.nama = "matematika";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        matakuliah18 mk2 = new matakuliah18("skh8", "sistem komputer", 3, 6);

        mk1.tampilInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        mk2.kurangiJam(7);
        mk2.tampilInformasi();
        mk2.ubahSks(1);
        mk2.tambahJam(2);
        mk2.tampilInformasi();



    }
}