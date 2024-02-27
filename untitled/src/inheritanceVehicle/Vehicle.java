package inheritanceVehicle;

public class Vehicle {
    public double defaultFuelConsumption = 1.25;
    public double fuelConsumption;
    public double fuel;
    public int horsePower;
    public String model;
//    public int horsePower

    public Vehicle(String model, int horsePower, double fuel){
        this.model = model;
        this.horsePower = horsePower;
        this.fuel = fuel;
    }
    public void drive(Double kilometres){
        double consumedFuel = this.defaultFuelConsumption * kilometres; // Calculate consumed fuel
        this.fuel -= consumedFuel; // Subtract consumed fuel from the remaining fuel
//        System.out.printf("This is the remaining fuel: %.2f\n", fuel);
//        System.out.printf("This is the remaining fuel: %s",fuel);
    }
}
