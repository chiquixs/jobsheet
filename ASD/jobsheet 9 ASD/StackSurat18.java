public class StackSurat18{
    surat18[] stack;
    int top;
    int size;

    StackSurat18(int size){
        this.size = size;
        stack = new surat18[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(surat18 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public surat18 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada surat yang dikumulkan");
            return null;
        }
    }

    public surat18[] pindahkanTopKeArray() {
    if (!isEmpty()) {
        surat18[] result = new surat18[1];
        result[0] = stack[top];  // Ambil elemen teratas
        return result;
    } else {
        System.out.println("Stack kosong! Tidak ada data untuk dipindahkan.");
        return new surat18[0]; // Kembalikan array kosong
    }
}


    public void cariSurat(String nama, surat18[] result){
        boolean search = false;
        for(int i = 0; i <= top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat izin ditemukan pada index ke- " + i);
                System.out.println("ID Surat : " + stack[i].idSurat);
                System.out.println("Nama : " + stack[i].namaMahasiswa);
                System.out.println("Kelas : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + stack[i].jenisIzin);
                System.out.println("Durasi Izin : " + stack[i].durasi + " hari");
                search = true;
            }
        }

        if (!search && result != null) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] != null && result[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan di ARRAY RESULT pada indeks ke-" + i);
                    System.out.println("ID Surat     : " + result[i].idSurat);
                    System.out.println("Nama         : " + result[i].namaMahasiswa);
                    System.out.println("Kelas        : " + result[i].kelas);
                    System.out.println("Jenis Izin   : " + result[i].jenisIzin);
                    System.out.println("Durasi Izin  : " + result[i].durasi + " hari");
                    search = true;
                }
            }
        }

        if (!search) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}