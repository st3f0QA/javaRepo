package Homework_constructors;
import java.math.BigDecimal;

public class Book {
    String name;
    String author;
    String serialNumber;
    BigDecimal price = BigDecimal.valueOf(0);

    public Book(String name, String author, String serialNumber){
        if(name == null || name.length() <=2){
            System.out.println("Invalid name");
        }else{
            this.name = name;
        }
        if(author == null || author.length()<=5){
            System.out.println("Invalid author");
        }else{
            this.author = author;
        }
        if(serialNumber == null || serialNumber.length()<=7){
            System.out.println("Invalid serial number");
        }else{
            this.serialNumber = serialNumber;
        }
    }
    public Book(String name, String author, String serialNumber, BigDecimal price){
        this(name,author,serialNumber);
        this.price = price;
    }
}

