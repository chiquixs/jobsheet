import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat Datang");
        System.out.println("===================");
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int n = sc.nextInt();
        
        String matkul[] = new String[n];
        int sks[] = new int[n];
        int semester[] = new int[n];
        String hari[] = new String[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Mata Kuliah Ke-" + (i + 1) + " : ");
            matkul[i] = sc.next();

            System.out.print("Masukkan sks Matkul tersebut : ");
            sks[i] = sc.nextInt();

            System.out.print("Masukkan Semester : ");
            semester[i] = sc.nextInt();

            System.out.print("Masukkan Hari Matkul : ");
            sc.nextLine();
            hari[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Menampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Menampilkan Jadwal Kuliah Berdasarkan Hari Tertentu");
            System.out.println("3. Menampilkan Jadwal Kuliah Berdasarkan Semester Tertentu");
            System.out.println("4. Mencari Mata Kuliah");
            System.out.println("5. Exit");

            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    jadwalKuliahAll(matkul, sks, semester, hari);
                    break;
                case 2: 
                    sc.nextLine();
                    System.out.print("Masukkan hari : ");
                    String hariKey = sc.nextLine();
                    jadwalKuliahHari(matkul, sks, semester, hari, hariKey);
                    break; 
                case 3:
                    sc.nextLine();
                    System.out.println("Masukkan Semester : ");
                    int semesterKey = sc.nextInt();
                    jadwalKuliahSemester(matkul, sks, semester, hari, semesterKey);
                case 4: 
                    sc.nextLine();
                    System.out.println("Masukkan Nama Mata Kuliah : ");
                    String matkulKey = sc.nextLine();
                    jadwalMatkul(matkul, sks, semester, hari, matkulKey);

                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    static void jadwalKuliahAll(String matkul[], int sks[], int semester[], String hari[]) {
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Nama Mata Kuliah : " + matkul[i]);
            System.out.println("Sks : " + sks[i]);
            System.out.println("Semester : " + semester[i]);
            System.out.println("Hari : " + hari[i]);
            System.out.println("------------------------------------------------");
        }
    }

    static void jadwalKuliahHari(String matkul[], int sks[], int semester[], String hari[], String hariKey) {
        boolean found = false; // Flag for checking if any subject is found on that day
        
        for (int i = 0; i < hari.length; i++) {
            
            if (hari[i].equalsIgnoreCase(hariKey)) {
                // If a matching schedule is found
                System.out.println("Mata Kuliah: " + matkul[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                System.out.println("-------------------------------");
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah pada hari " + hariKey);
        }
    }

    static void jadwalKuliahSemester(String matkul[], int sks[], int semester[], String hari[], int semesterKey) {
        boolean found = false;

        for (int i = 0; i < semester.length; i++) {
            
            if (semester[i] == (semesterKey)) {
   
                System.out.println("Mata Kuliah: " + matkul[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                System.out.println("-------------------------------");
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah pada semester " + semesterKey);
        }
    }

    static void jadwalMatkul(String matkul[], int sks[], int semester[], String hari[], String matkulKey){
        boolean found = false;

        for (int i = 0; i < semester.length; i++) {
            
            if (matkul[i].equalsIgnoreCase(matkulKey)) {
   
                System.out.println("Mata Kuliah: " + matkul[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                System.out.println("-------------------------------");
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah " + matkulKey);
        }
    }


}