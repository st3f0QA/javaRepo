package inheritation;

public class Dog extends Animal{
    public Dog (){
        super(5,"Sharo","male");
    }

    public static void main(String[] args) {
        Dog doggy = new Dog();
        System.out.println(doggy.age + " " + doggy.name);
        doggy.makeSound("Ruf Ruf!");
    }
}
