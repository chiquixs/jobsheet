package assignment;

public class Demo {
    public static void main(String[] args) {
        Backend backend1 = new Backend("Aisyah Aqilah", "BK01", 8000000.0, 19, "MySql");
        System.out.println(backend1.getInfo());
        backend1.buildDatabase("db_manajemen");
        System.out.println("-----------------------");
        Frontend frontend1 = new Frontend("Jeff Smith", "FK01", 9000000.0, 22, "Figma");
        System.out.println(frontend1.getInfo());
        frontend1.buildUI("Design Manajemen Web");

        backend1.name = "Aqilah Aisyah";
        backend1.id = "BK00";
        backend1.salary = 3000000.0;
        backend1.age = 18;
        backend1.databaseLanguage = "PostgreSql";

        frontend1.name = "Smith Jeff";
        frontend1.id = "FK00";
        frontend1.salary = 5000000.0;
        frontend1.age = 20;
        frontend1.designTools = "Photo Shop";

        System.out.println("\nAfter change the value of each atribut from both object\n");
        System.out.println(backend1.getInfo());
        System.out.println("-----------------------");
        System.out.println(frontend1.getInfo());
    }
}
