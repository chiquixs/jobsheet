import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        while (lanjut) {
            int hasil = 0;
            System.out.print("Masukkan Angka Pertama : ");
            int num1 = sc.nextInt();
            System.out.println("Pilih Operator : ");
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. / ");
            System.out.println("4 * ");
            System.out.print("Masukkan Angka dengan operator pilihan : ");
            int operator = sc.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int num2 = sc.nextInt();
            switch (operator) {
                case 1:
                    hasil = num1 + num2;
                    break;

                case 2:
                    hasil = num1 - num2;
                    break;

                case 3:
                    hasil = num1 / num2;
                    break;

                case 4:
                    hasil = num1 * num2;
                    break;
                    
                default:
                    System.out.println("Jawabanmu tidak valid!");
                    continue;
            }

            System.out.println("Hasil Operasimu Adalah : " + hasil);
            System.out.println(" ");

            System.out.println("Apakah kamu mau menggunakan kalkulator lagi? (y/n)");
            sc.nextLine();
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("n")) {
                lanjut = false;
                System.out.println("terima kasih!");
            } 
            
        }
    }
}