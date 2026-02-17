package OrderSystem;

public class WebOrder extends Order implements Trackable{
    public String idOrder;
    public String website;

    public WebOrder(String product, double price, String idOrder, String website){
        super(product, price);
        this.idOrder = idOrder;
        this.website = website;
    }

    @Override
    public void confirmOrder(){
        System.out.println("Web order are confirmed on " + website + "!");
    }

    @Override
    public void trackStatus(){
        System.out.println("Track your package on our website! Your order id is : " + idOrder);
    }
}