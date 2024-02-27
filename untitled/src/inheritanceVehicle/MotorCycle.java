package inheritanceVehicle;

public class MotorCycle extends Vehicle{
    public MotorCycle(){
        super("MotorCycle",150,30);
        MotorCycle mc = new MotorCycle();
        mc.defaultFuelConsumption = (double) 8 /100;
    }
}
