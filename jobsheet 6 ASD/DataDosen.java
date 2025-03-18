public class DataDosen{
    Dosen[] listDosen = new Dosen[10];
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

}