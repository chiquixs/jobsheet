package userProfile;

public class Admin extends User {

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println("Vehicle details updated for ID : " + vehicleId);
    }

    public void addVehicle(String vehicleId) {
        System.out.println("New vehicle added with ID : " + vehicleId);
    }

    public void retrieveComplain() {
        System.out.println("Retrieving all customer complaints");
    }

    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("Customer " + customer.profile.getName() + " has been verified successfully.");
        } else {
            System.out.println("Customer " + customer.profile.getName() + " has not submitted documents yet.");
        }
    }
}