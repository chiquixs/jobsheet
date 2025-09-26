import java.util.ArrayList;

public class Employees {
    private String name;
    private String id;
    private String jobdesk;
    private ArrayList<Project> project;

    public Employees(String name, String id, String jobdesk){
        this.name = name;
        this.id = id;
        this.jobdesk = jobdesk;
        this.project = new ArrayList<>();
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
        System.out.println("Employee Name \t\t: " + name);
        System.out.println("Employee Id \t\t: " + id);
        System.out.println("Employee Work Section \t: " + jobdesk);
        if (project.isEmpty()) {
            System.out.println("Projects \t\t: (Not Working at any Project)");
        } else {
            System.out.println("- Projects -");
            for (Project p : project) {
                System.out.println(i + ". " + p.getName() + " (id : " + p.getId() + ")");
                i++;
            }
        }

        System.out.println("====================================");
    }

    public void addProject(Project p){
        if (!project.contains(p)) {
            project.add(p);
            p.addEmployee(this);
        }
    }
}