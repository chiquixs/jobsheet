import java.lang.classfile.components.ClassPrinter.Node;

public class DoubleLinkedList18 {
    Node18 head;
    Node18 tail;
    private int size;

    public DoubleLinkedList18(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(Mahasiswa18 data){
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(Mahasiswa18 data){
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa18 data){
        Node18 current = head;

        //mencari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node18 newNode = new Node18(data);

        //jika current adalah tail, cukup tambahkan di akhri
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            //sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print(){
        Node18 current = head;
        if (head == null) {
        System.out.println("Linked list kosong!");
        return;
        }

        System.out.println("Jumlah data : " + size);
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dihapus.");
            return;
        }

        Mahasiswa18 temp = head.data;

        if (head == tail) {
            // Hanya satu elemen
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        System.out.println("Data berhasil dihapus");
        System.out.println("Data yang terhapus adalah : ");
        temp.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dihapus.");
            return;
        }

        Mahasiswa18 temp = tail.data;

        if (head == tail) {
            // Hanya satu elemen
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        System.out.println("Data berhasil dihapus");
        System.out.println("Data yang terhapus adalah : ");
        temp.tampil();
    }

    public Node18 search(String nim) {
        Node18 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current; // ditemukan
            }
            current = current.next;
        }

        return null; // tidak ditemukan
    }

    public void add(int index, Mahasiswa18 data) {
        // Validasi index
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        
        // Jika index = 0, tambahkan di awal
        if (index == 0) {
            addFirst(data);
            return;
        }
        
        // Jika index = size, tambahkan di akhir
        if (index == size) {
            addLast(data);
            return;
        }
        
        // Tambahkan di tengah
        Node18 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        
        Node18 newNode = new Node18(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        
        size++; 
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat dihapus.");
            return;
        }
        
        Node18 current = head;
        
        // Mencari node dengan NIM = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        
        // Jika tidak ada node setelahnya
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }
        
        Mahasiswa18 temp = current.next.data;
        
        // Jika node yang akan dihapus adalah tail
        if (current.next == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }
        
        size--; 
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus");
        System.out.println("Data yang terhapus adalah: ");
        temp.tampil();
    }

    public void remove(int index) {
        // Validasi index
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong!");
            return;
        }
        
        // Jika index = 0, hapus dari awal
        if (index == 0) {
            removeFirst();
            return;
        }
        
        // Jika index = size-1, hapus dari akhir
        if (index == size - 1) {
            removeLast();
            return;
        }
        
        // Hapus di tengah
        Node18 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        Mahasiswa18 temp = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        
        size--; 
        System.out.println("Data pada indeks " + index + " berhasil dihapus");
        System.out.println("Data yang terhapus adalah: ");
        temp.tampil();
    }

    public Mahasiswa18 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return null;
        }
        return head.data;
    }

    public Mahasiswa18 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa18 getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong!");
            return null;
        }
        
        Node18 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        return current.data;
    }

    public int size(){
        return size;
    }
}