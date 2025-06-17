public class kampus {

    public kampus(){

    }

    public static int findMax(int nilaiUts[], int l, int r){
        if (l == r) {
            return nilaiUts[l];
        }

        int mid = (l + r) / 2;

        int leftMax = findMax(nilaiUts, l, mid);
        int rightMax = findMax(nilaiUts, mid + 1, r);
        
        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static int findMin(int nilaiUts[], int l, int r){
        if (l == r) {
            return nilaiUts[l];
        }

        int mid = (l + r) / 2;

        
        int leftMin = findMin(nilaiUts, l, mid);
        int rightMin = findMin(nilaiUts, mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }   
    }

    public static double sum(int nilaiUas[], int l, int r){
        if (l == r) {
            return nilaiUas[l];
        }

        int mid = (l + r) / 2;
        
        double leftSum = sum(nilaiUas, l, mid);
        double rightSum = sum(nilaiUas, mid + 1, r);

        return leftSum + rightSum;
    }

    public static double average(int nilaiUas[]){
        double total = kampus.sum(nilaiUas, 0, nilaiUas.length-1);
        return total / nilaiUas.length;
    }
}