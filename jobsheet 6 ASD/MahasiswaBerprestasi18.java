public class MahasiswaBerprestasi18 {
   
    // Mahasiswa18[] listMhs = new Mahasiswa18[5];
    // int idx;

    Mahasiswa18[] listMhs;
    int idx = 0;

    public MahasiswaBerprestasi18(int jumlahMahasiswa){
        listMhs = new Mahasiswa18[jumlahMahasiswa];
    }

    public void tambah(Mahasiswa18 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    public void tampil(){
        for (Mahasiswa18 m : listMhs){
            m.tampilInformasi();
            System.out.println("------------------------------------------------");
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
    public void SelectionSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa18 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // public void InsertionSort(){
    //     for (int i = 1; i < listMhs.length; i++){
    //         Mahasiswa18 temp = listMhs[i];
    //         int j = i;
    //         while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
    //             listMhs[j] = listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }

    public void InsertionSort(){
        for (int i = 1; i < listMhs.length; i++){
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    public int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas );
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("data mahasiswa dengan IPK " + x + " tidak ditemukan ");
        }
    }

    public int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    //pembetulan kode jika data diurutkan dari terbesar ke terkecil
    public int findBinarySearch2(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk < cari) { //ada dalam operator > yang dirubah mnj <
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}