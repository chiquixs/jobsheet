public class QueueKendaraan {
    Node front;  // Pointer ke depan antrian (kendaraan terdepan)
    Node rear;   // Pointer ke belakang antrian (kendaraan terbelakang)
    int size;

    public QueueKendaraan() {
        front = null; //antrian kosong
        rear = null;
        size = 0;
    }

    // Menambah kendaraan ke belakang antrian (enqueue)
    public void enqueue(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);
        if (rear == null) {
            front = rear = newNode;  // Jika queue kosong
        } else {
            rear.next = newNode;     // Tambah di belakang
            rear = newNode;          // Update rear
        }
        size++;
        System.out.println(">> Kendaraan " + kendaraan.platNomor + " masuk ke antrian.");
    }

    // Mengambil kendaraan dari depan antrian (dequeue)
    public Kendaraan dequeue() {
        if (front == null) {
            return null;  // Queue kosong (tidak ada antrian)
        }
        
        Kendaraan kendaraan = (Kendaraan) front.data; // casting
        front = front.next; // Pindahkan front diseger biar jadi di antrian berikutna
        if (front == null) {
            rear = null;  // Jika queue jadi kosong
        }
        size--;
        return kendaraan;
    }

    // Cek apakah queue kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Menampilkan seluruh antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n-- Antrian Kendaraan --");
        Node current = front;
        int nomor = 1;
        while (current != null) {
            Kendaraan k = (Kendaraan) current.data;
            System.out.println(nomor + ". Plat: " + k.platNomor + ", Tipe: " + k.tipe + ", Merk: " + k.merk);
            current = current.next;
            nomor++;
        }
    }

    public int jumlahAntrian(){
        return size;
    }
}

