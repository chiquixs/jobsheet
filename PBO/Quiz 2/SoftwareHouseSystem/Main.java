package SoftwareHouseSystem;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        // heterogeneus collection
        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev = new Developer("Selena", 8, 30000, "Java");
        Developer fe = new Frontend("Gomez", 7, 450000, "Dart", "Flutter");
        Designer design = new Designer("Naura", 5, 25000, "Figma");
        Employee engineer = new Engineering("Danny", 10, 55000, "JIRA");

        employees.add(dev);
        employees.add(fe);
        employees.add(design);
        employees.add(engineer);

        // instance of and object casting to display based on their job
        System.out.println("\n----- SPECIALIZED TASKS -----\n");
        for (Employee emp : employees) {
            if (emp instanceof Frontend) {
                Frontend feEmp = (Frontend) emp;
                System.out.println("--- FRONTEND DEVELOPER EMPLOYEE ---");
                feEmp.showInfo();
                feEmp.refresh();
                System.out.println(" ");
            }
            else if (emp instanceof Developer) {
                Developer devEmp = (Developer) emp; 
                System.out.println("--- DEVELOPER EMPLOYEE ---");
                devEmp.showInfo();
                devEmp.writeCode();
                System.out.println(" ");
            } 
            else if (emp instanceof Designer) {
                Designer desEmp = (Designer) emp;
                System.out.println("--- DESIGN EMPLOYEE ---");
                desEmp.showInfo();
                desEmp.editDesign();
                System.out.println(" ");
            } 
            else if (emp instanceof Engineering) {
                Engineering engEmp = (Engineering) emp;
                System.out.println("--- ENGINEERING EMPLOYEE ---");
                engEmp.showInfo();
                engEmp.maintainNetwork();
                System.out.println(" ");
            }
        }

        // polymorphic argument
        System.out.println("\n--- SALARY INFORMATION ---\n");
        for (Employee emp : employees) {
            giveSalary(emp);  
            System.out.println(" ");
        }
    }

    // polymorphic method
    public static void giveSalary(Employee e){
        System.out.println("Give Salary for : " + e.name);
        System.out.println("Total Salary   : " + e.calculateSalary());
    }
}