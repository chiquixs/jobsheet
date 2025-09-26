public class Produk {
    public String name;
    public String productId;
    public double price;
    public int qty;

    public void addProduct(String name, String productId, double price, int qty){
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.qty = qty; 
    }

    public void setUpdateQty(int qty){
        this.qty = qty;
    }

    public double totalPrice(){
        return price * qty;
    }

    public void showInfo(){
        System.out.println("Product Name : " + name);
        System.out.println("Product Id   : " + productId);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + qty);
    }
    

}