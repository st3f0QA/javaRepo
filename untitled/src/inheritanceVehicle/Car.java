package inheritanceVehicle;

public class Car extends Vehicle {
    public Car(){
        super("Car",110,60);

        defaultFuelConsumption = (double) 3 /100;
//        c.drive(40.0);
        double kilometres = 40;
        drive(kilometres);
    }
}
