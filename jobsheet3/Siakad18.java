import java.util.Scanner;

    /**
     * Siakad18
     */
    public class Siakad18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            String name, nim;
            char clas;
            // int score = 100;
            byte absence;
            double kuizScore, exerciseScore, testScore, nilaiAkhir;
            System.out.println("enter your name ");
            name = sc.nextLine();
            System.out.println("enter your nim ");
            nim = sc.nextLine();
            System.out.println("enter your clas ");
            clas = sc.nextLine().charAt(0);
            System.out.println("enter your absence number ");
            absence = sc.nextByte();

            System.out.println("enter your kuiz score ");
            kuizScore = sc.nextDouble();
            System.out.println("enter your exercize score ");
            exerciseScore = sc.nextDouble();
            System.out.println("enter your test score ");
            testScore = sc.nextDouble();
            System.out.println("enter your final score ");
            nilaiAkhir = sc.nextDouble();

            // kuizScore = score * 0.2;
            // exerciseScore = score * 0.15;
            // UTS = score * 0.3;
            // UAS = score * 0.35;
    
            // System.out.println("your kuiz score is " + kuizScore);
            // System.out.println("your exercise score is " + exerciseScore);
            // System.out.println("your UTS score is " + UTS);
            // System.out.println("your UAS score is " + UAS);









            // System.out.println("enter your kuiz score ");
            // kuizScore = sc.nextDouble();
            // System.out.println("enter your exercise score ");
            // exerciseScore = sc.nextDouble();
            // System.out.println("enter your test score ");
            // testScore = sc.nextDouble();
            // finalScore = (kuizScore + exerciseScore + testScore) / 3;
            // System.out.println("nama : " + name + "nim " + nim);
            // System.out.println("class : " + clas + "absence " + absence);
            // System.out.println("final score : " + finalScore);










        }
    }