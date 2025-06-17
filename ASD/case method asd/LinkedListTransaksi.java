public class LinkedListTransaksi {
    Node head;
    int size;

    public LinkedListTransaksi() {
        head = null;
        size = 0;
    }

    // Menambah transaksi ke akhir list
    public void tambahTransaksi(TransaksiPengisian transaksi) {
        Node newNode = new Node(transaksi);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // kalo == nul brati udah bener, dia emang cari yang == 0 buat jadi kuren akhir
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Menampilkan semua transaksi
    public void tampilkanRiwayatTransaksi() {
        if (head == null) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.println("\n-- Riwayat Transaksi (LINKED LIST) --");
        System.out.println("Daftar Transaksi:");
        Node current = head;
        int nomor = 1;
        while (current != null) {
            TransaksiPengisian t = (TransaksiPengisian) current.data;
            System.out.println(nomor + ". " + t.kendaraan.platNomor + " - " + t.bbm.namaBBM + " - " + t.liter + "L - Rp " + t.totalBayar);
            current = current.next;
            nomor++;
        }
        System.out.println("Total transaksi: " + size);
    }

    public int getSize() {
        return size;
    }
}