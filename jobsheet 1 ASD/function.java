import java.util.Scanner;
public class function {
  
    static int[][] stokBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static void pendapatan() {
        int price[] = {75000, 50000, 60000, 10000};
        double totalPriceAlgonema;
        double totalPriceKeladi;
        double totalPriceAlocasia;
        double totalPriceMawar;
        

        for(int i = 0; i < stokBunga.length; i++){
            totalPriceAlgonema = stokBunga[i][0] * price[0];
            totalPriceKeladi = stokBunga[i][1] * price[1];
            totalPriceAlocasia = stokBunga[i][2] * price[2];
            totalPriceMawar = stokBunga[i][3] * price[3];  
            double totalAll = totalPriceAlgonema + totalPriceKeladi + totalPriceAlocasia + totalPriceMawar;
            System.out.println("total pendapatan cabang ke " + (i+1) + " adalah " + totalAll);         
        }    
              
        
    }

    static void stokCabang4(){
        int bungaRusak[] = {1, 2, 0, 5};
        String bunga[] = {"Algonema","Keladi", "Alocasia", "Mawar"};

        for(int i = 0; i < stokBunga.length; i++){
            int totalAkhir = stokBunga [3][i] - bungaRusak[i];
            System.out.println("Stok bunga saat ini di cabang 4 adalah " + bunga[i] + " " + totalAkhir);
        }
        

    }

    public static void main(String[] args) {
        pendapatan();
        stokCabang4();

    }


}

