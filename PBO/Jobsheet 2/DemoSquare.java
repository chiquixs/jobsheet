public class DemoSquare{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.longs = 20;
        r1.wide = 12;

        r1.displayInfo();
        System.out.println("Square Area Values   : " + r1.getArea());
        System.out.println("Square Circumference : " + r1.getCircumference());
    }
}