package Polymorphism;

public abstract class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }
    abstract String sayHello();
    public String toString() {
        return this.name;
    }
    public void getName(){
        System.out.println(this.name);
    }
}
