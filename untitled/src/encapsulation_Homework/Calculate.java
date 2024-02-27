package encapsulation_Homework;

public class Calculate {
    private double length;
    private double height;
    private double width;




    public Calculate(double length, double height, double width){
        this.setLength(length);
        this.setHeight(height);
        this.setWidth(width);
    }

    public double surfaceArea(){
        double surfArea = (2 * length * width) + (2 * length * height + 2 * height * width);
        return  surfArea;
    }
    public double lateralSurface(){
        double latSurface = (2 * length * height) + (2 * width * height);
        return latSurface;
    }
    public double volumePara(){
        double volume = width * height * length;
        return volume;
    }
    private void setLength(double length){
        if(length > 0){
            this.length = length;
        }
        else{
            System.out.println("Not a valid value!!");
        }
    }
    private void setHeight(double height){
        if(height > 0){
            this.height = height;
        }
        else{
            System.out.println("Not a valid value!!");
        }
    }
    private void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
        else{
            System.out.println("Not a valid value!!");
        }
    }


}
