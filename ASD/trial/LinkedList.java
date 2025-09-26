public class LinkedList {
    Node head;
    Node tail;

    public LinkedList(){
        head = tail = null;
    }

    public void enqueue(Mahasiswa m){
        Node NewNode = new Node(m);
        if (head == null) {
            head = tail = NewNode;
        } else {
            tail.next = NewNode;
            tail = NewNode;
        }
    }

    public Mahasiswa dequeue(){
        Mahasiswa m = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return m;
    }

    public Mahasiswa peek() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return null;
    }
    return head.data;
    }


    public void tampilAntrian(){
        Node temp = head;
        while (temp != null) {
            Mahasiswa m = temp.data;
            m.tampilInfo();
            temp = temp.next;
        }
    }

    public boolean hapus(String hnim){
        if (head == null) {
            return false;
        }
        
        if (head.data.nim.equals(hnim)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }
        Node n = head;
        while (n.next != null) {
            if (n.next.data.nim.equals(hnim) ) {
                n.next = n.next.next;

                if (n.next == null) {
                    tail = n;
                }
                return true;
            }
            n = n.next;

        }
        return false;
    }

    public boolean hapusPosisi(int index) {
    if (head == null || index < 0) return false;

    if (index == 0) { // hapus posisi pertama
        head = head.next;
        if (head == null) tail = null;
        return true;
    }

    Node current = head;
    for (int i = 0; i < index - 1; i++) {
        if (current.next == null) return false; // index out of bounds
        current = current.next;
    }

    if (current.next == null) return false;

    current.next = current.next.next;

    if (current.next == null) tail = current;

    return true;
    }

    public Mahasiswa cariByAbsen(int absen) {
    Node current = head;
    while (current != null) {
        if (current.data.absen == absen) {
            return current.data;
        }
        current = current.next;
    }
    return null;
    }

    public boolean isEmpty(){
        return head == null;
    }


}