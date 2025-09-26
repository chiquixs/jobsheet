class Stack {
    Node top;

    public void push(Mahasiswa m) {
        Node newNode = new Node(m);
        newNode.next = top;
        top = newNode;
    }

    public Mahasiswa pop() {
        if (top == null) return null;
        Mahasiswa m = top.data;
        top = top.next;
        return m;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Belum ada mahasiswa yang dilayani.");
            return;
        }

        System.out.println("Riwayat Mahasiswa yang Dilayani:");
        Node current = top;
        while (current != null) {
            System.out.println("- " + current.data.nama + " | " + current.data.nim);
            current = current.next;
        }
    }
}
