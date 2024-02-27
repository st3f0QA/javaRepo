package inheritation;

public class Animal {
    public int age;
    public String name;
    public String gender;

    public Animal(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void makeSound(String sound){
        System.out.print(sound);
    }
}
