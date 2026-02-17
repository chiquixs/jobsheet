package SoftwareHouseSystem;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int workHour, double salary, String programmingLanguage){
        super(name, workHour, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Employee with name : " + name + "\nCreate a Program using " + programmingLanguage + " language");
    }

    @Override
    public void showInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Work Hour     : " + workHour);
        System.out.println("Salary        : " + calculateSalary());
        System.out.println("Language      : " + programmingLanguage);
    }

    public void writeCode(){
        System.out.println("Employee do their coding task... ");
    }

    public String getProgrammingLanguange(){
        return programmingLanguage;
    }
}