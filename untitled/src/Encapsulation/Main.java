package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(14000,"Nissan","640x",155);
        Car c2 = new Car(16000,"Mercedes","GLE",300);
//        c.setPrice(12500);
//        c.changeEngine(100);
        c1.changeEngine(140);
        c2.changeEngine(300);
        System.out.println( c1.getBrand() + " " + c1.getModel());


        c1.setPrice(150);
//        System.out.println(c1.setPrice(213));
    }
}
