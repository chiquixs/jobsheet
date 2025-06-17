public class mahasiswaMain18 {

    public static void main(String[] args) {
        mahasiswa18 mhs1 = new mahasiswa18();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "224720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa18 mhs2 = new mahasiswa18("Annisa Nabila","214720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa18 mhsNafisa = new mahasiswa18("Nafisa Chiquita","244107060020", 3.7, "SIB 1G");
        mhsNafisa.tampilkanInformasi();
    }
}