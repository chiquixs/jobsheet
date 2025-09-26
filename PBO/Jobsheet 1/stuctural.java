public class stuctural {
    public static void main(String[] args) {
        String merk, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        int ram, ram2, ram3, ram4, ram5, ram6, ram7, ram8, ram9, ram10;
        int storage, storage2, storage3, storage4, storage5, storage6, storage7, storage8, storage9, storage10;
        
        merk = "lenovo";
        ram = 16;
        storage = 512;

        merk2 = "HP";
        ram2 = 8;
        storage2 = 225;

        merk3 = "acer";
        ram3 = 20;
        storage3 = 225;

        merk4 = "asus";
        ram4 = 8;
        storage4 = 1000;

        merk5 = "apple";
        ram5 = 16;
        storage5 = 600;

        merk6 = "dell";
        ram6 = 8;
        storage6 = 512;

        merk7 = "samsung";
        ram7 = 16;
        storage7 = 512;

        merk8 = "msi";
        ram8 = 28;
        storage8 = 1000;

        merk9 = "ROG";
        ram9 = 8;
        storage9 = 760;

        merk10 = "Thinkpad";
        ram10 = 8;
        storage10 = 800;

        tampilInfo(merk, ram, storage);
        jumlah(ram, storage);

        tampilInfo(merk2, ram2, storage2);
        jumlah(ram2, storage2);

        tampilInfo(merk3, ram3, storage3);
        jumlah(ram3, storage3);

        tampilInfo(merk4, ram4, storage4);
        jumlah(ram4, storage4);

        tampilInfo(merk5, ram5, storage5);
        jumlah(ram5, storage5);

        tampilInfo(merk6, ram6, storage6);
        jumlah(ram6, storage6);

        tampilInfo(merk7, ram7, storage7);
        jumlah(ram7, storage7);

        tampilInfo(merk8, ram8, storage8);
        jumlah(ram8, storage8);

        tampilInfo(merk9, ram9, storage9);
        jumlah(ram9, storage9);
        
        tampilInfo(merk10, ram10, storage10);
        jumlah(ram10, storage10);
    }

    public static int jumlah(int ram, int storage){
        int jumlah = ram + storage;
        System.out.println("Jumlah RAM dan Storage : " + jumlah);
        System.out.println(" ");
        return jumlah;
    }

    public static void tampilInfo(String mk, int rm, int sg){
        System.out.println("Nama Laptop : " + mk);
        System.out.println("RAM : " + rm);
        System.out.println("Storage : " + sg);
    }


}
