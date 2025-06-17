import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===========================");

        String matkul[] = {
            "Pancasila", "Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktek Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int nilai[] = new int[matkul.length];
        String nilaiHuruf[] = {"A", "B+", "B", "C+", "C", "D", "E"}; 
        double nilaiSetara[] = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul[i] + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("===========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===========================");

        double totalNilai = 0;
        for (int i = 0; i < matkul.length; i++) {
            String huruf;
            double setara;

        
            if (nilai[i] > 80 && nilai[i] <= 100) {
                huruf = nilaiHuruf[0]; 
                setara = 4.0;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                huruf = nilaiHuruf[1]; 
                setara = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                huruf = nilaiHuruf[2]; 
                setara = 3.0;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                huruf = nilaiHuruf[3]; 
                setara = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                huruf = nilaiHuruf[4]; 
                setara = 2.0;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                huruf = nilaiHuruf[5]; 
                setara = 1.0;
            } else {
                huruf = nilaiHuruf[6]; 
                setara = 0.0;
            }

            nilaiSetara[i] = setara;
            totalNilai += setara;

        
            System.out.printf("%-40s %3d  %-2s  %.2f\n", matkul[i], nilai[i], huruf, setara);
        }


        double ipk = totalNilai / matkul.length;

        System.out.println("===========================");
        System.out.printf("IP Semester Anda: %.2f\n", ipk);

    }
}
