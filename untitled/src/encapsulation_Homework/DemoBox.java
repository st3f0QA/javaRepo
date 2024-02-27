package encapsulation_Homework;

public class DemoBox {
    public static void main(String[] args) {
        Calculate cal = new Calculate(3,4,5);
        System.out.println(cal.lateralSurface());
        System.out.println(cal.surfaceArea());
        System.out.println(cal.volumePara());

        Calculate incorrectValues = new Calculate(-1,0,-10);
        ;
    }



}
