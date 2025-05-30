public class StackTugasMahasiswa18{
    Mahasiswa18[] stack;
    int top;    // data paling atas
    int size;   
    
    StackTugasMahasiswa18(int size){ // minta panjang array
        this.size = size;
        stack = new Mahasiswa18[size];
        top = -1; //kalo -1 brati gaada data

    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) { //indikator -1 karena nilai default dari top
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa18 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa18 pop(){
        if (!isEmpty()) {
            Mahasiswa18 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa18 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa18 bottom(){
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! tidak ada data yang dimasukkan");
            return null;
        }
    }

    public int total(){
        return top+1;
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi18 stack = new StackKonversi18();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
