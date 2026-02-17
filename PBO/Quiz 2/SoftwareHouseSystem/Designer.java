package SoftwareHouseSystem;

public class Designer extends Employee{
    private String tools;

    public Designer(String name, int workHour, double salary, String tools){
        super(name, workHour, salary);
        this.tools = tools;
    }

    @Override
    public void work() {
    System.out.println("Employee with name : " + name + 
                        "\nUsing tools: " + tools + 
                        "\nDo their engineering tasks.");
    }

    @Override
    public void showInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Work Hour     : " + workHour);
        System.out.println("Salary        : " + calculateSalary());
        System.out.println("Design Tools  : " + tools);
    }

    public void editDesign(){
        System.out.println("Employe edit their design...");
    }
}