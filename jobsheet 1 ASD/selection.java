import java.util.Scanner;
public class selection {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("===============================");

    int assignmentScore;
    int quizScore;
    int midExam;
    int finalExam;
    double finalScore;
    // double persenAssignment;
    // double persenQuiz;
    // double persenMidExam;
    // double persenFinalExam;

    System.out.print("input your assignment score : ");
    assignmentScore = sc.nextInt();
    System.out.print("input your quiz score : ");
    quizScore = sc.nextInt();
    System.out.print("input your mid exam score : ");
    midExam = sc.nextInt();
    System.out.print("input your final exam score : ");
    finalExam = sc.nextInt();

    System.out.println("=========================");
    System.out.println("=========================");

    if (assignmentScore < 0 || assignmentScore > 100) {
        System.out.println("assignment score is invalid");
    } else if (quizScore < 0 || quizScore > 100) {
        System.out.println("quiz score is invalid");
    } else if (midExam < 0 || midExam > 100) {
        System.out.println("mid exam score is invalid");
    } else if (finalExam < 0 || finalExam > 100) {
        System.out.println("final exam score is invalid");
    }

    double persenAssignment = assignmentScore * 0.2;
    double persenQuiz = quizScore * 0.2;
    double persenMidExam = midExam * 0.3;
    double persenFinalExam = finalExam * 0.4;

    finalScore = (persenAssignment + persenQuiz + persenMidExam + persenFinalExam);

    System.out.println("your final score is : " + finalScore);

    if (finalExam > 80 && finalExam <= 100) {
        char grade = 'A';
        System.out.println("nilai angka : " + grade);
    } else if (finalExam > 73 && finalExam <= 80 ) {
        String grade2 = "B+";
        System.out.println("nilai angka : " + grade2);
    } else if (finalExam > 65 && finalExam <= 73) {
        char grade3 = 'B';
        System.out.println("nilai akhir : " + grade3);
    } else if (finalExam > 60 && finalExam <= 65) {
        String grade4 = "C+";
        System.out.println("nilai akhir : " + grade4);
    } else if (finalExam > 50 && finalExam >= 60) {
        char grade5 = 'C';
        System.out.println("nilai akhir : C ");
    } else if (finalExam > 39 && finalExam <= 50) {
        char grade6 = 'D';
        System.out.println("nilai akhir : " + grade6);
    } else {
        char grade7 = 'E';
        System.out.println("nilai akhir : " + grade7);
    }

    System.out.println("=========================");
    System.out.println("=========================");

    if (finalExam >= 50) {
        System.out.println("SELAMAT ANDA LULUS");
    } else {
        System.out.println("MAAF ANDA TIDAK LULUS");
    }



    }
}