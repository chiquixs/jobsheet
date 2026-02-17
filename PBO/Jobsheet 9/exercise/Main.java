package exercise;

public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Salsa", 2000000, "SF01", 300000);
        System.out.println("STAFF 1");
        staff1.showTask();
        staff1.calculateSalary();
        staff1.showInfo();

        Manager manager1 = new Manager("Devan", 5000000, "MN01", 750000);
        System.out.println("MANAGER 1");
        manager1.showTask();
        manager1.calculateSalary();
        manager1.showInfo();
    }
}
