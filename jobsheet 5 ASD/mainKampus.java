public class mainKampus {

    public static void main(String[] args) {

        int[] nilaiUts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUas = {82, 88, 87, 79, 95, 85, 83, 84};
        
        int n = nilaiUts.length;

        int max = kampus.findMax(nilaiUts, 0, n-1);
        System.out.println("Nilai UTS tertinggi adalah : " + max);

        int min = kampus.findMin(nilaiUts, 0, n-1);
        System.out.println("Nilai UTS terendah adalah : " + min);

        double average = kampus.average(nilaiUas);
        System.out.println("Rata - rata nilai UAS adalah : " + average);


    }
}