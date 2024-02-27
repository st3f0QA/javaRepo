package Homework_constructors;
import java.math.BigDecimal;

public class Customer {
    String name;
    int age;
    double money;
    int rentedBooks;

    public String toString() {
        return "Customer{name='" + name + "', age=" + age + "}";
    }

    public Customer(String name, int age, int rentedBooks){
        if(name == null || name.length() <=2){
            System.out.println("Invalid customer name!");
        }else{
            this.name = name;
        }if( age < 7){
            System.out.println("You are too young to rent a book!");
        }else{
            this.age = age;
        }
        if(rentedBooks > 2){
            System.out.println("You can't rent more than 2 books.");
        }else{
            this.rentedBooks = rentedBooks;
        }
    }
    public Customer(String name, int age, int rentedBooks, double money){
        this(name,age,rentedBooks);
        this.money = money;
    }
    public void rentBook(){
        Customer newCustomer = new Customer(this.name,this.age,this.rentedBooks,this.money);
    }
}

