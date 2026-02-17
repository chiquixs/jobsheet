package userProfile;

import java.util.ArrayList;

public class UserProfile {

    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private ArrayList<String> doc;

    public UserProfile(int userId, String password, String name, int age, String emailId){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = new ArrayList<>();
    }

    public int getUserId(){
        return userId;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmailId(){
        return emailId;
    }

    public void setDocuments(ArrayList<String> docs){
        this.doc = docs;
    }


    public void editProfile(String name, int age, String emailId){
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("profile updated !");
    }

    public void showProfile(){
        System.out.println("-- User Profile --");
        System.out.println("Nama    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + emailId);
        System.out.println("Dokumen : ");
        if (doc.isEmpty()) {
            System.out.println("  (Belum ada dokumen)");
        } else {
            for (String d : doc) {
                System.out.println("  - " + d);
            }
        }
    }

    public void addDocument(String document) {
        if (document != null && !document.isEmpty()) {
            doc.add(document);
        }
    }
}