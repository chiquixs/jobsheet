import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char kode[] = {'A','B','D','E','F','G','H','L','N','T'};
        char kota[][] = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan Kode Plat Mobil yang Anda Inginkan : ");
        char platCustomer = sc.next().charAt(0);

        for(int i = 0; i < kode.length; i++) {
            if (platCustomer == kode[i]) {
                String kotaAsli = new String (kota[i]);
                System.out.println("Kota Asal Anda adalah : " + kotaAsli);
            }

        }

        


    }
}