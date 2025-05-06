public class AntrianPersetujuanKRS{
    Mahasiswa[] data;
        int front;
        int rear;
        int size;
        int max;
        int totalproses;

        public AntrianPersetujuanKRS(int max){
            this.max = max;
            this.data = new Mahasiswa[max];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public int jumlahAntrian(){
        return size;
    }

    public int jumlahProses(){
        return totalproses;
    }

    public int belumDiproses(){
        return 30 - totalproses;
    }

    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (!IsFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public Mahasiswa[] layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("antrian kosong");
            return null;
        }
    
        //array untuk menyimpan dua mahasiswa yang akan diproses
        Mahasiswa[] mhsArray = new Mahasiswa[2];
        int count = 0;
    
        //proses dua mahasiswa 
        while (count < 2 && !IsEmpty()) {
            mhsArray[count] = data[front];
            front = (front + 1) % max;
            size--;
            count++;
        }
        totalproses += count;
    
        return mhsArray;
    }

    public void tampilkanSemuaAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaAntrianTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Dua Antrian Terdepan:");
        for (int i = 0; i < 2 && !IsEmpty(); i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanAntrianPalingAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int index = rear; // rear menunjuk ke elemen terakhir
        data[index].tampilkanData();
    }

    
}