package exercise;

public abstract class Employee {
    String name;
    double salary;
    String id;

    public Employee(String name, double salary, String id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract void showTask();

    public void showInfo(){
        System.out.println("Name         : " + this.name);
        System.out.println("Salary       : " + this.salary);
        System.out.println("ID           : " + this.id);
    }
}
