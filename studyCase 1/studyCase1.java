
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
        System.out.println("Name of Student : ");
        String name = sc.nextLine();
        System.out.println("NIM of Student : ");
        int nim = sc.nextInt();
        System.out.println("Achievemnt Type :");
        String achievement = sc.nextLine();
        System.out.println("Level of Achievemt : ");
        String level = sc.nextLine();
        System.out.println("Year of Achievement : ");
        int year = sc.nextInt();

        nameStudent = [name][0];

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