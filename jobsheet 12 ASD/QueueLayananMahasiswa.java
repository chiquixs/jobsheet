public class QueueLayananMahasiswa {
    nodeLayanan front;
    nodeLayanan rear;
    int size;

    public QueueLayananMahasiswa(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void enqueue(mahasiswaLayanan mhs) {
        nodeLayanan newNode = new nodeLayanan(mhs);
        
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        
        rear = newNode;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke dalam antrian!");
    }

    public mahasiswaLayanan dequeue() {
        if (isEmpty()) {
            return null;
        }
        
        mahasiswaLayanan temp = front.data;
        front = front.next;
        
        // Jika front menjadi null, antrian kosong, set rear ke null
        if (front == null) {
            rear = null;
        }
        
        size--;
        return temp;
    }

    public mahasiswaLayanan peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    public mahasiswaLayanan peekLast() {
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }

     public boolean isFull() {
        return false;
    }

     public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }




}