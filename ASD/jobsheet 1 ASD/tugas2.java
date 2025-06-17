import java.util.Scanner;
public class tugas2 {

    static int sisi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("MENU UTAMA");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Exit");
            System.out.print("Choose a menu : ");
            int menu = input.nextInt();
            System.out.print("Masukkan sisi kubus : ");
            sisi = input.nextInt();

            switch (menu) {
                case 1: volumeKubus();   
                    break;
                case 2: luasPermukaanKubus();
                    break;
                case 3: kelilingKubus();
                    break;
                default: System.out.println("exiting program");
                    return;
            }

        }
    }

    static void volumeKubus() {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
        System.out.println("===================================");
    }

    static void luasPermukaanKubus() {
        int luas = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan Kubus : " + luas);
        System.out.println("===================================");
    }
        

    static void kelilingKubus() {
        int keliling = 12 * sisi;
        System.out.println("Keliling Kubus : " + keliling);
        System.out.println("===================================");
    }


}