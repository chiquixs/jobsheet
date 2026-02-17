package userProfile;
import java.util.ArrayList;

class Customer extends User {

    private Boolean verificationStatus = false;
    private ArrayList<String> doc;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
        this.doc = new ArrayList<>();
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(ArrayList<String> docs) {
        if (docs != null && !docs.isEmpty()) {
            for (String d : docs) {
                profile.addDocument(d); 
                this.doc.add(d);
            }
            verificationStatus = true;
            System.out.println("Uploading documents successful!");
        } else {
            System.out.println("Nothing to upload!");
        }
    }

}