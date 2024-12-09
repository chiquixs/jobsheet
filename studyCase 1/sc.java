import java.util.Scanner;

public class sc {

    static String[][] nameStudent = new String[5][5];

    public static void main(String[] args) {
        inputAchievement();
    }

    static void inputAchievement() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("MENU");
            System.out.println("1. Enter Achievement Data");
            System.out.println("2. Show All Achievements");
            System.out.println("3. Achievement Analysis by Type");
            System.out.println("4. Out");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Membersihkan newline character

            switch (choice) {
                case 1:
                    for (int i = 0; i < nameStudent.length; i++) {
                        System.out.print("Name of Student: ");
                        nameStudent[i][0] = sc.nextLine(); // Indeks 0 untuk nama
                        System.out.print("NIM of Student: ");
                        int nim = sc.nextInt();
                        nameStudent[i][1] = String.valueOf(nim); // Indeks 1 untuk NIM
                        sc.nextLine(); // Membersihkan newline character

                        System.out.print("Achievement Type: ");
                        nameStudent[i][2] = sc.nextLine(); // Indeks 2 untuk jenis pencapaian

                        while (true) {
                            System.out.print("Level of Achievement (Local/National/International): ");
                            String level = sc.nextLine();
                            if (level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National") || level.equalsIgnoreCase("International")) {
                                nameStudent[i][3] = level; // Indeks 3 untuk level
                                break;
                            } else {
                                System.out.println("Invalid input, please enter again.");
                            }
                        }

                        while (true) {
                            System.out.print("Enter year (2010 - 2024): ");
                            int year = sc.nextInt();
                            if (year >= 2010 && year <= 2024) {
                                nameStudent[i][4] = String.valueOf(year); // Indeks 4 untuk tahun
                                System.out.println("Input data success!");
                                break;
                            } else {
                                System.out.println("Invalid year, please enter again.");
                            }
                        }
                    }
                    break; // Kembali ke menu setelah selesai input data

                case 2:
                    System.out.println("--- Display Data ---");
                    for (int i = 0; i < nameStudent.length; i++) {
                        System.out.println("Student " + (i + 1) + ":");
                        System.out.println("Name: " + nameStudent[i][0]);
                        System.out.println("NIM: " + nameStudent[i][1]);
                        System.out.println("Achievement Type: " + nameStudent[i][2]);
                        System.out.println("Level: " + nameStudent[i][3]);
                        System.out.println("Year: " + nameStudent[i][4]);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Achievement Analysis by Type (not implemented yet).");
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return; // Keluar dari program

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}