import java.util.Scanner;

public class ExpressingGratitude_18 {
    public static String getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    
    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being best teacher in the world.\n" + 
        "You imspired in me a love for learning and made me feel like I could ask you anything.");

    }

    public static void sayAdditionalGreetings(String additional){
       
        
    }
    
    public static void main(String[] args) {
     
        sayThankyou();
        String data = "this is additional";
        sayAdditionalGreetings(data);
        System.out.println(data);        
        
        
        
    }
}