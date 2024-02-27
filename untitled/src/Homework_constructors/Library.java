package Homework_constructors;
import java.lang.reflect.Array;

public class Library {
    String name = "Unknown library";
    int books;
    int customers;
    int size = 3;
    String[] bookCollection = new String[size];
    Customer[] customerArray = new Customer[2];


    public Library(int books, int customers){
        if(books > 3){
            System.out.println("There is space for only 3 books!");
        }
        else{
            this.books = books;
        }
        if(customers > 2){
            System.out.println("There is space for only 2 customers");
        }else{
            this.customers = customers;
        }
    }
    public Library(String name, int books, int customers){
        this(books,customers);
        this.name = name;
    }
    public void addBook(String name){
        if(this.bookCollection.length > this.books){
            System.out.println("There is space for only 3 books!");
        }
        else{
            for (int i = 0; i < this.bookCollection.length; i++){

                if (Array.get(bookCollection,i) == null){
                    this.bookCollection[i] = name;
                    break;
                }
            }
        }
    }

    public void addCustomer(Customer customer){
        if(this.customerArray.length > this.customers){
            System.out.println("There is space for only 2 customers!");
        }
        else{
            for (int i = 0; i < this.customerArray.length; i++){
                if (Array.get(customerArray,i) == null){
                    this.customerArray[i] = customer;
                    break;
                }
            }
        }
    }

    public void searchBookByName(String name){
        for ( String allBooks : bookCollection){
            if(allBooks == name){
                System.out.println("We have this book already");
                break;
            }
            else{
//                System.out.println("We don't have this book");
                addBook(name);
            }
        }
    }
}

