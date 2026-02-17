package OrderSystem;
import java.time.LocalDate;

public abstract class Order{
    public LocalDate orderDate;
    public String product;
    public double price;

    public Order(String product, double price){
        this.orderDate = LocalDate.now();
        this.product = product;
        this.price = price;
    }

    public abstract void confirmOrder();

    public void showInfo(){
        System.out.println("Product Order : " + product);
        System.out.println("Product Price : " + price);
    }

}