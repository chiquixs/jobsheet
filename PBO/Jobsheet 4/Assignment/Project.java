import java.util.ArrayList;

public class Project {
    private String name;
    private int id;
    private ArrayList<Employees> employee;
    private Client client;

    public Project(String name, int id, Client client){
        this.name = name;
        this.id = id;
        this.employee = new ArrayList<>();
        this.client = client;
        client.addProject(this); 
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void showInfo(){ 
        int i = 1;  
        System.out.println("Project name \t: " + name);
        System.out.println("Project id \t: " + id);
        System.out.println("Client \t\t: " + client.getName());
        System.out.println("- Employees -");

        for(Employees e : employee){
            System.out.println(i + ". " + e.getName());
            i++;
        }

        System.out.println("====================================");
    }

    public void addEmployee(Employees e){
        if (!employee.contains(e)) {
            employee.add(e);
            e.addProject(this); 
        }
    }
}