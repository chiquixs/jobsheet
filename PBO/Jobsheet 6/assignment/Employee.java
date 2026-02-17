package assignment;

public class Employee {

    String name;
    String id;
    Double salary;
    int age;

    public Employee(){

    }

    public Employee(String name, String id, Double salary, int age){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public String showInfo(){
        String info = " ";
        info += "Name  : " + name + "\n";
        info += "Id     : " + id + "\n"; 
        info += "Salary : " + salary + "\n";
        info += "Age    : " + age + "\n";

        return info;
    }

    public double countSalary(){
        double total = salary * 30;
        return total;
    }
}
