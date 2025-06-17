public class dosenMain18 {

    public static void main(String[] args) {
        dosen18 dosen1 = new dosen18();
        dosen1.idDosen = "jhkdgt12";
        dosen1.nama = "Kirman";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1997;
        dosen1.bidangKeahlian = "Sistem Operasi";

        dosen18 dosen2 = new dosen18("kksmh3", "leni", false, 2001, "dasar pemrograman");

        dosen1.tampilInformasi();
        System.out.println(" ");
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("sistem informasi");
        dosen1.tampilInformasi();
        System.out.println(" ");

        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja : " + dosen2.hitungMasaKerja(2025));
        // bisa dibikin variabel juga
        // int masaKerja =  dosen2.hitungMasaKerja(2025);
        // System.out.println("masa kerja : " + masaKerja);

        dosen2.tampilInformasi();
    }
}