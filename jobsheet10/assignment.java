public class assignment {
    static int number(int a){
      
        while (a <= 100) {
            a += 2;
            if (a % 2 == 0) {
                System.out.println(a);
            }
        } 
        return a;
    }
    static int total(){
        int i = 0;
        for(i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                i+=1;
            } 
        }
        return i;
    }

   public static void main(String[] args) {
    int hasil = number (0);
   
    System.out.println(total());
   }
    
}
