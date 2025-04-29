import java.util.Scanner;

public class SuratDemo18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(5);
        surat18[] result = new surat18[5];

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Proses surat izin");
            System.out.println("3. Lihat surat izin terakhir");
            System.out.println("4. Cari surat");
            System.out.println("5. Exit program");
            System.out.print("Masukkan menu yang ingin anda cari : ");
            int menu = sc.nextInt();
            System.out.println("-------------------------------------------------------");
            System.out.println("");
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("---------MASUKKAN DATA SURAT----------");
                    System.out.print("Id surat : ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama mahasiswa : ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S : Sakit, I : Izin): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi : ");
                    int durasi = sc.nextInt();
                    surat18 surat = new surat18(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat milik " + surat.namaMahasiswa + " berhasil di terima");
                    System.out.println("");
                    break;

                case 2:
                    surat18[] suratTop = stack.pindahkanTopKeArray();
                    if (suratTop.length > 0) {
                        System.out.println("Data surat teratas berhasil dipindahkan ke array");
                        System.out.println("Nama : " + suratTop[0].namaMahasiswa);
                        System.out.println("Id Surat : " + suratTop[0].idSurat);
                    }
                    System.out.println("");
                    break;

                case 3:
                    surat18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir diinput oleh " + lihat.namaMahasiswa);
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari : ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari, result);
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("exit program...");
            }
        }
    }
}