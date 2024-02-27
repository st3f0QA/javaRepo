package inheritation;

public class Frog extends Animal {
    public Frog(){
        super(2,"Frogo","female");
    }

    public static void main(String[] args) {
        Frog froggy = new Frog();
        System.out.println(froggy.age + " " + froggy.name);
        froggy.makeSound("KVAK KVAK!!");

    }
}
