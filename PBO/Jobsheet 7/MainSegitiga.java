public class MainSegitiga{
    public static void main(String[] args) {
        
        Segitiga sg1 = new Segitiga();
        
        System.out.println("Method totalSudut(sudutA) " + sg1.totalSudut(8));
        System.out.println("Method totalSudut(sudutA, sudutB) " + sg1.totalSudut(8, 10));
        System.out.println("Method keliling(sisiA, sisiB) " + sg1.keliling(15, 9));
        System.out.println("Method keliling(sisiA, sisiB, sisiC) " + sg1.keliling(3, 6, 9));
    }
}