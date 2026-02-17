package exercise;

public class Manager extends Employee {
    double allowance;

    public Manager(String name, double salary, String id, double allowance){
        super(name, salary, id);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return salary + allowance;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Final Salary : " + calculateSalary() + "\n");
    }

    @Override
    public void showTask() {
        System.out.println("daily operational supervision");
        System.out.println("arranging meeting schedules");
        System.out.println("ensuring office procedures run smoothly");
        
    }



}
