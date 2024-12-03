public class Experiment5_18 {

    // static void show (String str, int... a){
    //     System.out.println("String : " + str);
    //     System.out.println("number of arguments/parameter : " + a.length);

    //     for (int i : a){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    static void variousVariable (String sss, int... number){
        System.out.println("String : " + sss);
        System.out.println("the value is : " + number.length);

        for (int answer : number){
            System.out.println("the answer is : " + answer + " ");

        }
        System.out.println();
    } 
    public static void main(String[] args) {
        variousVariable("first question : ", 87, 62);
        variousVariable("jsdhka", 1,2,3,4,5);
        // show("Programming Fundaentals", 100,200);
        // show("Information Technology", 1,2,3,4,5);
        // show("Informatics");
    }
}