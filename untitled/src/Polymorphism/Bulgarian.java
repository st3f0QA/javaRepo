package Polymorphism;

public class Bulgarian extends Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    String sayHello() {
        return "Здравей";
    }


//    @Override
//    public void getName(String name) {
//        super(name);
//    }
}
