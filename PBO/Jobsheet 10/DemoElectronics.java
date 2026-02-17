public class DemoElectronics {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas Dinding", 350000, "Putih", "Cosmos");
        TV tv = new TV("Oled", 50, 1000000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(4, 1500000, "Silver", "Polytron");
        SmartFridge smartFridge = new SmartFridge(20, 6, 500000, "Rose Gold", "Liebherr");

        System.out.println("-- INFORMASI TOKO ELEKTRONIK --\n");
        System.out.println("** KULKAS **");
        System.out.println(kipas.getInfo());
        System.out.println(" ");
        System.out.println("** TV **");
        System.out.println(tv.getInfo());
        System.out.println(" ");
        System.out.println("** KULKAS **");
        System.out.println(kulkas.getInfo());
        System.out.println(" ");
        System.out.println("** SMARTFRIDGE **");
        System.out.println(smartFridge.getInfo());
        System.out.println(" ");
        System.out.println("CONTOH OUTPUT DARI INTERFACE METHOD");
        smartFridge.naikkanVolume(20);
        System.out.println("Volume Setelah Dinaikkan  20 : " + smartFridge.getVolume());
        smartFridge.turunkanVolume(10);
        System.out.println("Volume Setelah Diturunkan 10 : " + smartFridge.getVolume());

    }
}
