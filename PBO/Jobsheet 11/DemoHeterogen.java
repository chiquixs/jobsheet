import java.util.ArrayList;

public class DemoHeterogen {
    public static void main(String[] args) {
        // Dosenn dosen2 = new Dosenn("19700105", "Muhammad, S.T, M.T", "197001");
        // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md", "Tenaga Administrasi");
        // TenagaKependidikan tendik2 = new TenagaKependidikan("1950304", "Rika, S.T", "Tenaga Labolatorium");

        // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);

        // System.out.println("Jumlah Pegawai : " + daftarPegawai.size());

        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // System.out.println(dosen1.nidn);
        // dosen1.mengajar();

        // Pegawai pegawai1 = dosen1;

        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();

        // Dosenn newDosen = (Dosenn) pegawai1;

        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        // newDosen.mengajar();

        Dosenn dosen1 = new Dosenn("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);

        // Objek dari class Pegawai
        Pegawai pegawai1 = new Pegawai("001", "Budi");

        // Downcasting secara paksa
        Dosenn dosen2 = (Dosenn) pegawai1; // akan error saat runtime

        // Mencoba memanggil method milik Dosenn
        dosen1.displayIndo();
        dosen1.mengajar();
        
    }

    public static void train(Pegawai pegawai){
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosenn) {
            System.out.println("Memberikan pelatihan pedagogik");
        } else {
            System.out.println(".");
        }
    }

}
