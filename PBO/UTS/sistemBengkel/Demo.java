package sistemBengkel;

public class Demo {

    public static void main(String[] args) {
        
        System.out.println("=== Data Servis Bengkel Maju Jaya ===");
        Mobil mobil = new Mobil("N 1234 AB", "Toyota", 2020, "Mobil", "Bensin");
        System.out.println(mobil.showInfo());
        System.out.println(" ");
        
        Motor motor = new Motor("N 5678 XY", "Honda", 2022, "Motor", "Matic");
        System.out.println(motor.showInfo());
        System.out.println(" ");

        // mencoba menggunakan cara lain untuk mengakses fungsi totalPrice
        System.out.println(mobil.totalPrice(30000));
        System.out.println(mobil.totalPrice(400000, 70000));
    }
}