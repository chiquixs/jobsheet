
import java.util.Scanner;
public class studyCase1 {

    static String[][] nameStudent = new String[5][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {       
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("MENU");
            System.out.println("1. Enter Achievement Data");
            System.out.println("2. Show All Achievements ");
            System.out.println("3. Achievement Analysis by Type");
            System.out.println("4. Out");
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                inputAchievement();
                break;
                
                case 2:
                break;
                case 3:
                break;
                case 4:
                return;
              

                default:
                break;
                
            }
        }
    }
     
    
    static void inputAchievement(){
    Scanner sc= new Scanner(System.in);

        for (int i = 0; i < nameStudent.length; i++){
        System.out.println("Name of Student : ");
        nameStudent[i][0] = sc.nextLine();

        System.out.println("NIM of Student : ");
        int nim = sc.nextInt();  
        nameStudent[i][1] = String.valueOf(nim);

        System.out.println("Achievemnt Type :");
        nameStudent[i][2] = sc.nextLine();
        sc.nextLine();

        while (true) {
            System.out.println("level of achivement :");
            String level = sc.nextLine();
                if (level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National") || level.equalsIgnoreCase("International")) {
                    nameStudent[i][3] = level;
                    break;
                } else {
                    System.out.println("invalin input, please enter again");
                }
            }   
        while (true) {
            System.out.println("enter year (2010 - 2024) : ");
            int year = sc.nextInt();
                if (year >= 2010 && year <= 2024) {
                    nameStudent[i][4] = String.valueOf(year);
                    System.out.println("input data succes!");
                    break;
                } else {
                    System.out.println("invalid year, please enter again");
                }
            }    
        } 
                   
    }          
}        
    

    

    
    

