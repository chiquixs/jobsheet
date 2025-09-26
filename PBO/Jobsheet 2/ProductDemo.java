public class ProductDemo {
    public static void main(String[] args) {
        Produk p = new Produk();
        p.name = "Dress";
        p.productId = "DRS01";
        p.price = 399000;
        p.qty = 10;

        Produk p1 = new Produk();
        p1.name = "Top";
        p1.productId = "TP01";
        p1.price = 199000;
        p1.qty = 25;

        System.out.println("PRODUCT 1");
        p.showInfo();
        System.out.println("Total Gross Income : " + p.totalPrice());
        System.out.println(" ");
        System.out.println("PRODUCT 2");
        p1.showInfo();
        System.out.println("Total Gross Income : " + p1.totalPrice());
        System.out.println(" ");
        
        System.out.println("UPDATE QTY DRESS");
        p.setUpdateQty(30);
        p.showInfo();

        System.out.println(" ");

        Produk p2 = new Produk();
        System.out.println("ADD PRODUCT 3");
        p2.addProduct("Sweater", "SWT01", 599000, 5);
        p2.showInfo();
        System.out.println("Total Gross Income : " + p2.totalPrice());

    }
}