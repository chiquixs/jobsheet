package assignment;

public class Frontend extends Employee {
    
    String designTools;

    public Frontend(){

    }

    public Frontend(String name, String id, Double salary, int age, String designTools){
        super(name, id, salary, age);
        this.designTools = designTools;
    }

    public String getInfo(){
        String info = super.showInfo();
        info += "Design Tools : " + this.designTools;

        return info;
    }

    public void buildUI(String title){
        System.out.println("You Build New Design with Title " + title + "!");
    }
}
