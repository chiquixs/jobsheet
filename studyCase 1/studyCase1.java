
import java.util.Scanner;
public class studyCase1 {

    static String[][] nameStudent = new String[5][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Enter Achievement Data");
            System.out.println("2. Show All Achievements ");
            System.out.println("3. Achievement Analysis by Type");
            System.out.println("4. Out");
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: inputAchievement();
                case 2: displayStudent();
                    break;
            
                default:
                    break;

            }

        }
    }
     
    
     static void inputAchievement(){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < nameStudent.length; i++){
            System.out.println("Name of Student : ");
            nameStudent[i][1] = sc.nextLine();
            System.out.println("NIM of Student : ");
            int nim = sc.nextInt();  
            nameStudent[i][2] = String.valueOf(nim);
            System.out.println("Achievemnt Type :");
            nameStudent[i][3] = sc.nextLine();
            sc.nextLine();
            while (true) {
                System.out.println("level of achivement :");
                String level = sc.nextLine();
                if (level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National") || level.equalsIgnoreCase("International")) {
                    nameStudent[i][4] = level;
                    break;
                } else {
                    System.out.println("invalin input, please enter again");
                }
            }
          

            while (true) {
                System.out.println("enter year (2010 - 2024) : ");
                int year = sc.nextInt();
                if (year >= 2010 && year <= 2024) {
                    nameStudent[i][5] = String.valueOf(year);
                    break;
                } else {
                    System.out.println("invalid year, please enter again");
                }
                
            }
    
        }        
     }

     static void inputAchievement2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Level of Achievemt (Local/National/International) : ");
        String level = sc.nextLine();
            if (level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National") || level.equalsIgnoreCase("International")) {
                inputAchievement2();
            } 
    }

    static void inputAchievement3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Year of Achievement (2010-2024): ");
        int year = sc.nextInt();

    }

    
    // static void inputAchievement (){
    //     Scanner sc = new Scanner(System.in);
    //     for (int a = 0; a < 5; a++){
    //         for (int i = 0; i < 5; i++){
    //             if (a == 0 && i == 0) {
    //                 System.out.println("Name of Student : ");
    //                 nameStudent[a][i] = sc.nextLine();
    //             }else if (a == 0 && i == 1) {                  
    //                 System.out.println("NIM of student : ");
    //                 int nim = sc.nextInt();
    //                 nameStudent[a][i] = String.valueOf(nim);
    //             } else if (a == 0 && i == 2) {
    //                 System.out.println("enter achievemnt type : ");
    //                 nameStudent[a][i] = sc.nextLine();
    //                 sc.nextLine();
    //             } else if (a == 0 && i == 3){
    //                 System.out.println("level of achievemnt : ");
    //                 nameStudent[a][i] = sc.nextLine();                   
    //             } else {
    //                 System.out.println("year of achievement : ");
    //                 int year = sc.nextInt();
    //                 nameStudent[a][i] = String.valueOf(year);
                    
    //             }
    //         }
         
    //     }
               

        // System.out.println("NIM of Student : ");
        // int nim = sc.nextInt();
        // System.out.println("Achievemnt Type :");
        // String achievement = sc.nextLine();
        // System.out.println("Level of Achievemt : ");
        // String level = sc.nextLine();
        // System.out.println("Year of Achievement : ");
        // int year = sc.nextInt();
   
    // }

    static void displayStudent(){
        System.out.println(nameStudent);
    }

}