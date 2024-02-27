package Encapsulation;

public class Car {
    private double price;
    private String brand;
    private String model;
    private int engines;

    public void setPrice(double price){
        this.price = price;
        System.out.println(this.price);
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public Car(double price, String brand, String model, int engines){
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.engines = engines;

    }
    public void changeEngine(int engines){
        if(this.engines < 100){
            this.engines = engines;
            System.out.println(this.engines);

        }
        else{
            System.out.println("Horsepower is over 100!!");
            System.out.println(this.engines);
        }



    }
}
