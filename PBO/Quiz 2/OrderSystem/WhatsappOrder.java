package OrderSystem;

public class WhatsappOrder extends Order{
    public String phoneNumber;

    public WhatsappOrder(String product, double price, String phoneNumber){
        super(product, price);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void confirmOrder(){
        System.out.println("WhatsApp order confirmed via chat to: " + phoneNumber);
    }
}