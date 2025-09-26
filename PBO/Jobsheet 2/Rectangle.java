public class Rectangle {
    public int longs;
    public int wide;

    public void displayInfo(){
        System.out.println("Long : " + longs);
        System.out.println("Wide " + wide);
    }

    public int getArea(){
        return longs * wide;
    }

    public int getCircumference(){
        return 2 * (longs + wide);
    }
    
}