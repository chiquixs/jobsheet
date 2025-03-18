public class MahasiswaBerprestasi18 {
   
    Mahasiswa18[] listMhs = new Mahasiswa18[5];
    int idx;

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
}