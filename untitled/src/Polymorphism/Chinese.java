package Polymorphism;

public class Chinese extends Person {
    public Chinese(String name){
        super(name);
    }

    @Override
    String sayHello() {
        return "Konichua";
    }
}
