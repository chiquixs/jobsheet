package OrderSystem;

public class MailOrder extends Order implements Trackable{
    public String shippingService;
    public String resiNumber;

    public MailOrder(String product, double price, String shippingService, String resiNumber){
        super(product, price);
        this.shippingService = shippingService;
        this.resiNumber = resiNumber;
    }

    @Override
    public void confirmOrder(){
        System.out.println("Order confirmed, Your package will be send by " + shippingService + "!");
    }

    @Override
    public void trackStatus(){
        System.out.println("Please track your package on " + shippingService + " website with your number resi : " + resiNumber);
    }
}