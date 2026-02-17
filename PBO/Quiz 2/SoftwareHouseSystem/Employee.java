package SoftwareHouseSystem;

public abstract class Employee{
    protected String name;
    protected int workHour;
    protected double salaryPerHour;

    public Employee(String name, int workHour, double salaryPerHour){
        this.name = name;
        this.workHour = workHour;
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateSalary(){
        return workHour * salaryPerHour;
    }

    public void showInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Work Hour     : " + workHour);
        System.out.println("Salary        : " + calculateSalary());
    }

    public abstract void work();
}