package Homework_constructors;

public class Main {
    public static void main(String[] args) {
        Customer customerA =new Customer("Stefan",28,2,30.5);
        Customer customerB =new Customer("Gega",28,2,30.5);
        Customer customerC =new Customer("Ella",28,2,30.5);
        Library newBook = new Library("Unknown",3,2);
        newBook.addBook("Tom Soyer");
        newBook.addBook("The art of the good life");
        newBook.addBook("Third Book");
        newBook.addBook("Tom soy");
//
//        System.out.print(newBook.bookCollection.length); //3

        newBook.searchBookByName("The art of the good life");
        newBook.searchBookByName("Third Book");

         for (String s : newBook.bookCollection) {
            System.out.println(s);
        }
        newBook.addCustomer(customerA);
        newBook.addCustomer(customerB);
        newBook.addCustomer(customerC);
        System.out.println("List of customers:");

//        for (Customer customer : newBook.customerArray) {
//            if (customer != null) {
//                System.out.println(customer);
//            }
//        }


    }
}
