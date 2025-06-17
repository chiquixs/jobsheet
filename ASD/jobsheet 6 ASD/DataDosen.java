public class DataDosen{
    Dosen[] listDosen = new Dosen[3];
    int idx;

    public void tambahDosen(Dosen s){
        if (idx < listDosen.length) {
            listDosen[idx] = s;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    public void tampil(){
        for (Dosen s : listDosen){
            s.tampilData();
            System.out.println("------------------------------------------------");
        }
    }

    
    public void bubbleSort(){
        for (int i = 0; i < listDosen.length - 1; i++){
            for (int j = 1; j < listDosen.length - i; j++){
                if (listDosen[j].usia < listDosen[j-1].usia) {
                    Dosen tmp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = tmp;
                }
            }
        }
    }

    public void SelectionSort(){
        for (int i = 0; i < listDosen.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listDosen.length; j++){
                if (listDosen[j].usia > listDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen tmp = listDosen[idxMin];
            listDosen[idxMin] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    public void InsertionSort(){
        for (int i = 1; i < listDosen.length; i++){
            Dosen temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j-1].usia < temp.usia) {
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp;
        }
    }

    public void PencarianDataSequential18(String nama){
        boolean ditemukan = false;
        int jumlahPencarian = 0;
        for (int i = 0; i < idx; i++){
            if (listDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Dosen ditemukan pada indeks ke-" + i);
                listDosen[i].tampilData();
                System.out.println("-----------------------------------------");
                ditemukan = true;
                jumlahPencarian++;
                
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (jumlahPencarian > 1) {
            System.out.println("PERINGATAN !! Ditemukan lebih dari 1 dosen dengan nama yang sama !");
        }
    }

    public void PencarianDataBinary18(int usia){
        InsertionSort(); //urutin dulu
        
        int left = 0, right = idx - 1;
        boolean found = false;
        int jumlahPencarian = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listDosen[mid].usia == usia) {
                int tempMid = mid;
                while (tempMid >= 0 && listDosen[tempMid].usia == usia) {
                    listDosen[tempMid].tampilData();
                    System.out.println("-----------------------------------------");
                    found = true;
                    jumlahPencarian++;
                    tempMid--;
                }
                tempMid = mid +1;
                while (tempMid < idx && listDosen[tempMid].usia == usia) {
                    listDosen[tempMid].tampilData();
                    found = true;
                    jumlahPencarian++;
                    tempMid++;
                }
                break;
            } else if (listDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("dosen dengan usia " + usia + " tidak ditemukan");
        } else if (jumlahPencarian > 1 ) {
            System.out.println("PERINGATAN !! Ditemukan lebih dari 1 dosen dengan usia yang sama !");
        }
    }

    

}