package exercise;

public class Staff extends Employee {
    
    double overtimeSalary;
    
    public Staff(String name, double salary, String id, double overtimeSalary){
        super(name, salary, id);
        this.overtimeSalary = overtimeSalary;
    }
    
    @Override
    public double calculateSalary() {
        return salary + overtimeSalary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Final Salary : " + calculateSalary() + "\n");
    }

    @Override
    public void showTask() {
        System.out.println("answering phones and managing correspondence");
        System.out.println("handling company documents and filing");
        System.out.println("managing office supplies");
        
    }

}
