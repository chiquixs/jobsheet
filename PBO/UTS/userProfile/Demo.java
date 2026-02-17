package userProfile;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        System.out.println("** CUSTOMER **");
        Customer customer = new Customer(1, "Caca1234", "Nafisa Chiquita", 19, "nafisa@gmail.com");
        customer.profile.showProfile();
        
        System.out.println(" ");
        System.out.println("-- MENAMBAHKAN DOKUMEN --");
        ArrayList<String> docs = new ArrayList<>();
        docs.add("KTP.png");
        docs.add("SIM.pdf");
        customer.applyVerification(docs);

        System.out.println(" ");
        customer.profile.showProfile();
        System.out.println(" ");
        
        System.out.println("-- Login with Wrong Password --");
        customer.log_in(1, "pass123");
        System.out.println(" ");

        System.out.println("-- Login with Right Password --");
        customer.log_in(1, "Caca1234");
        System.out.println(" ");

        System.out.println("-- Recovery Wrong Data --");
        customer.recoverPassword("john@email.com", 1);
        System.out.println(" ");

        System.out.println("-- Recovery Right Data --");
        customer.recoverPassword("nafisa@gmail.com", 1);
        System.out.println(" ");

        System.out.println("-- Log Out --");
        customer.logOut();
        System.out.println(" ");

        System.out.println("** ADMIN **");
        Admin admin = new Admin(2, "admin2", "Silvia", 23, "silvia@gmail.com");
        admin.profile.showProfile();
        System.out.println(" ");

        System.out.println("-- Login Admin --");
        admin.log_in(2, "admin2");
        System.out.println(" ");

        System.out.println("-- Update Vehicle --");
        admin.updateVehicleDetails("B 4144 acd");
        System.out.println(" ");

        System.out.println("-- Add Vehicle --");
        admin.addVehicle("N 3045 BGH");
        System.out.println(" ");

        System.out.println("-- Retrieve Complain --");
        admin.retrieveComplain();
        System.out.println(" ");

        System.out.println("-- Verify User --");
        admin.verifyUser(customer);
        System.out.println(" ");

        System.out.println("-- Log Out --");
        admin.logOut();
    }
}