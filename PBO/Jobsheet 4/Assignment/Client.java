import java.util.ArrayList;

public class Client{
    private String name;
    private String id;
    private ArrayList<Project> projects; 

    public Client(String name, String id){
        this.name = name;
        this.id = id;
        this.projects = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public void showInfo(){
        int i = 1;
        System.out.println("Client Name \t: " + name);
        System.out.println("Client id \t: " + id);
        System.out.println("- Projects -");
        for(Project p : projects){
            System.out.println(i + ". " + p.getName());
            i++;
        }
        System.out.println("====================================");
    }

    public void addProject(Project p){
        if (!projects.contains(p)) {
            projects.add(p);
        }
    }
}