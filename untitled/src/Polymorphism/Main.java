package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Pesho"));
//        persons.add(new Bulgarian("Gosho"));
        persons.add(new European("Marco Polo"));
        persons.add(new Chinese("Jung Lee"));
        for (Person person : persons) {
//            System.out.println(Bulgarian.toString());
            print(person);
        }


        Bulgarian bg = new Bulgarian("Pesho");
        bg.getName();
        Chinese ch = new Chinese("Jung Lee");
        ch.getName();
        European eu = new European("Marco Polo");
        eu.getName();

//        European eu = new European();
//        eu.getName("Mr. Europe");
    }
    private static void print(Person person){
        if (person.sayHello() == null){

        }else{
            System.out.println(person.sayHello());
        }

    }
}

