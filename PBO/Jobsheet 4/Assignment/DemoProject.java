public class DemoProject{
    public static void main(String[] args) {

        Employees emp1 = new Employees("Virginia Swat", "VS001", "UI/UX");
        Employees emp2 = new Employees("David Goh", "DG001", "Front End");
        Employees emp3 = new Employees("Luthfi Halimawan", "LH001", "Back End");
        Employees emp4 = new Employees("Laura Lim", "LM001", "Data Base");
        Employees emp5 = new Employees("Cyntia Lov", "CL001", "Network Engineer");

        Client cln1 = new Client("Meliana Gotania", "WD01");
        Client cln2 = new Client("Varent Law", "MA01");
        Client cln3 = new Client("Aliya Valisha", "DB01");
        
        Project pj1 = new Project("Web Design ML", 178, cln1);
        Project pj2 = new Project("Web Full", 198, cln2);
        Project pj3 = new Project("Database Design", 786, cln3);
        Project pj4 = new Project("Network", 897, cln3);

        System.out.println("-- EMPLOYEE LIST --");
        emp1.showInfo();
        emp2.showInfo();
        emp3.showInfo();
        emp4.showInfo();
        emp5.showInfo();

        System.out.println(" ");
        System.out.println("-- CLIENT LIST --");
        cln1.showInfo();
        cln2.showInfo();
        cln3.showInfo();

        System.out.println(" ");
        System.out.println("-- PROJECT LIST --");
        pj1.showInfo();
        pj2.showInfo();
        pj3.showInfo();
        pj4.showInfo();
        
        System.out.println(" ");
        System.out.println("== ADD EMPLOYE TO PROJECT ==");
        pj1.addEmployee(emp1);
        pj2.addEmployee(emp1);
        pj2.addEmployee(emp2);
        pj2.addEmployee(emp3);
        pj3.addEmployee(emp4);
        pj3.addEmployee(emp5);
        pj4.addEmployee(emp5);

        pj1.showInfo();
        pj2.showInfo();
        pj3.showInfo();
        pj4.showInfo();

        System.out.println(" ");
        System.out.println("== UPDATE EMPLOYEE ==");
        emp1.addProject(pj1);
        emp1.addProject(pj2);
        emp2.addProject(pj2);
        emp3.addProject(pj2);
        emp4.addProject(pj3);
        emp5.addProject(pj3);

        emp1.showInfo();
        emp2.showInfo();
        emp3.showInfo();
        emp4.showInfo();
        emp5.showInfo();
    }
}