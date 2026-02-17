package OrderSystem;

public class Main {
    public static void main(String[] args) {
        WhatsappOrder wa = new WhatsappOrder("Skirt", 200000, "0896789810298");
        MailOrder mail = new MailOrder("Dress", 499000, "JNT", "JX9089");
        WebOrder web = new WebOrder("T-Shirt", 99000, "SH123", "www.shirtku.com");

        System.out.println("- ORDER SYSTEM -");
        System.out.println("---- First Order by WA ----");
        System.out.println("Ordered on : " + wa.orderDate);
        wa.showInfo();
        wa.confirmOrder();
        System.out.println(" ");
        System.out.println("---- Second Order by Mail ----");
        System.out.println("Ordered on : " + mail.orderDate);
        mail.showInfo();
        mail.confirmOrder();
        mail.trackStatus();
        System.out.println(" ");
        System.out.println("---- Third Order by Web ----");
        System.out.println("Ordered on : " + web.orderDate);
        web.showInfo();
        web.confirmOrder();
        web.trackStatus();
        System.out.println(" ");
        System.out.println("Thank You for Your Order!");

    }
}