package inheritanceVehicle;

public class SportCar extends Car {
    public SportCar(){
        defaultFuelConsumption = (double) 10 /100;
        fuel = 50;
        drive(40.0);
//        System.out.println(defaultFuelConsumption);
        System.out.printf("This is the remaining fuel: %.2f\n", fuel);
    }

    public static void main(String[] args) {
        SportCar s = new SportCar();
//        s.drive();+
    }
}
