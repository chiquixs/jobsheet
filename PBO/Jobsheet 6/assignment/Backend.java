package assignment;

public class Backend extends Employee{
    
    String databaseLanguage;

    public Backend(){

    }

    public Backend(String name, String id, Double salary, int age, String databaseLanguage){
        super(name, id, salary, age);
        this.databaseLanguage = databaseLanguage;
    }

    public String getInfo(){
        String info = super.showInfo();
        info += "Database Laguage : " + this.databaseLanguage;

        return info;
    }

    public void buildDatabase(String dbName){
        System.out.println("You Build a New Database Namely " + dbName + "!");
    }

}
