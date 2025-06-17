import java.util.Scanner;

public class SistemSPBU {
    private QueueKendaraan antrianKendaraan;           // QUEUE untuk antrian
    private StackMelayaniKendaraan kendaraanDilayani;  // STACK untuk yang sedang dilayani
    private LinkedListTransaksi riwayatTransaksi;      // LINKED LIST untuk riwayat
    private BBM[] daftarBBM;

    public SistemSPBU() {
        antrianKendaraan = new QueueKendaraan();
        kendaraanDilayani = new StackMelayaniKendaraan();
        riwayatTransaksi = new LinkedListTransaksi();
        
        // Inisialisasi daftar BBM
        daftarBBM = new BBM[2];
        daftarBBM[0] = new BBM("Pertamax", 12400);
        daftarBBM[1] = new BBM("Pertalite", 10000);
    }

    // 1. Tambah kendaraan ke antrian (menggunakan QUEUE)
    public void tambahKendaraanKeAntrian(String platNomor, String tipe, String merk) {
        Kendaraan kendaraan = new Kendaraan(platNomor, tipe, merk);
        antrianKendaraan.enqueue(kendaraan);  // FIFO - masuk di belakang
    }

    // 2. Tampilkan antrian kendaraan
    public void tampilkanAntrian() {
        antrianKendaraan.tampilkanAntrian();
    }

    //3. tampilkan jumlah antrian
    public void jumlahAntrian(){
        int jumlah = antrianKendaraan.jumlahAntrian();
        System.out.println("Jumlah antrian = " + jumlah);
    }

    // 4. Mulai melayani kendaraan (pindah dari QUEUE ke STACK)
    public void mulaiMelayaniKendaraan() {
        Scanner scanner = new Scanner(System.in);

        if (antrianKendaraan.isEmpty()) {
            System.out.println("Tidak ada kendaraan dalam antrian.");
            return;
        }
        Kendaraan kendaraan = antrianKendaraan.dequeue();  // Ambil dari depan antrian
        kendaraanDilayani.push(kendaraan);   
        
        System.out.println("Petugas melayani \"" + kendaraan.platNomor + "\"");
        // Tampilkan daftar BBM
        System.out.println("Pilih Jenis BBM:");
        for (int i = 0; i < daftarBBM.length; i++) {
            System.out.println((i + 1) + ". " + daftarBBM[i].namaBBM + " - Rp " + daftarBBM[i].hargaPerLiter + " per liter");
        }

        System.out.print("Masukkan pilihan BBM [1-" + daftarBBM.length + "]: ");
        int pilihanBBM = scanner.nextInt();
        BBM bbmDipilih = daftarBBM[pilihanBBM - 1];

        System.out.print("Masukkan jumlah liter: ");
        double liter = scanner.nextDouble();

        // Buat transaksi dan simpan
        TransaksiPengisian transaksi = new TransaksiPengisian(kendaraan, bbmDipilih, liter);
        riwayatTransaksi.tambahTransaksi(transaksi);

        System.out.println(">> Transaksi berhasil dicatat.\n");

        }

    // 5. Tampilkan riwayat transaksi
    public void tampilkanRiwayatTransaksi() {
        riwayatTransaksi.tampilkanRiwayatTransaksi();
    }
}
