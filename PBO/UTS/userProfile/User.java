package userProfile;

public class User {
    protected int userId;
    protected String password;
    protected UserProfile profile;

    public User() {
    }

    public User(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public Boolean log_in(int userId, String password) {
        Boolean confirm = this.userId == userId && this.password.equals(password);
        if (!confirm) {
            System.out.println("Login Failed, wrong username or password!");
        } else {
            System.out.println("Login Succes!");
        }
        return confirm;
    }

    public void recoverPassword(String emailId, int userId) {
        if (profile.getEmailId().equals(emailId) && profile.getUserId() == userId) {
            System.out.println("Password will send to " + emailId + " please wait !");
        } else {
            System.out.println("Data not valid !");
        }
    }

    public void logOut() {
        System.out.println("Succes Log Out Bye!");
    }
}