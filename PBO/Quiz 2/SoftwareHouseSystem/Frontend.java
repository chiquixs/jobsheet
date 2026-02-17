package SoftwareHouseSystem;

public class Frontend extends Developer{
    private String framework;

    public Frontend(String name, int workHour, double salary, String programmingLanguage, String framework){
        super(name, workHour, salary, programmingLanguage);
        this.framework = framework;
    }

    @Override
    public void showInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Work Hour     : " + workHour);
        System.out.println("Salary        : " + calculateSalary());
        System.out.println("Language      : " + getProgrammingLanguange());
        System.out.println("Framework     : " + framework);
    }

    public void refresh(){
        System.out.println("Refresh your design...");
    }
}