public class AbstactClassDemo {
    public static void main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println(" ");
        System.out.println(" ");
        Ular ular1 = new Ular(false, 3, "Tikus", "Sawah");
        ular1.bergerak();
        ular1.bernapas();
        ular1.cetakInfo();
    }
}
