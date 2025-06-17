public class StackMelayaniKendaraan {
    Node top;
    int size;

    public StackMelayaniKendaraan() {
        top = null;
        size = 0;
    }

    public void push(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);
        newNode.next = top;  // Node baru menunjuk ke top lama
        top = newNode;       // Top sekarang adalah node baru
        size++;
        System.out.println(">> Kendaraan " + kendaraan.platNomor + " sedang dilayani.");
    }

    // Mengambil kendaraan dari atas stack (pop)
    public Kendaraan pop() {
        if (top == null) {
            return null;  // Stack kosong
        }
        
        Kendaraan kendaraan = (Kendaraan) top.data;
        top = top.next;  // Pindahkan top ke node berikutnya
        size--;
        return kendaraan;
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return top == null;
    }
}
