import java.util.Objects;
import java.util.Scanner;

public class GSM {
    public String model;
    public String manufacturer;
    public double price;
    public int totalCallNumber; // Static field

    public String batteryModel;
    public double idleTime;
    public double phoneUsageTime;

    public String displaySize;
    public int colors;

    public void Model(String model){
        GSM tryClass = new GSM();
        this.model = model;
        if (model == "iPhone"){

          this.manufacturer = "Apple";
          this.price = 1600;
          this.totalCallNumber = 1000;

          this.batteryModel = "AppleBat";
          this.idleTime = 48; //h
          this.phoneUsageTime = 12; //h

          this.displaySize = "860x400px";
          this.colors = 160000;


        }else if(Objects.equals(model, "Huawei")){
         this.manufacturer = "Huawei";
         this.price = 1000;
         this.totalCallNumber = 500;

         this.batteryModel = "ChineseLion";
         this.idleTime = 64; //h
         this.phoneUsageTime = 32; //h

         this.displaySize = "720x500";
         this.colors = 320000;

        }else if(Objects.equals(model, "Pixel")){
         this.manufacturer = "Google";
         this.price = 800;
         this.totalCallNumber = 650;

         this.batteryModel = "G0bAt";
         this.idleTime = 74; //h
         this.phoneUsageTime = 15; //h

         this.displaySize = "800x360";
         this.colors = 50000;

        }
        printPhoneDetails();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nHow long have you talked?");
//        int secondsTalk = Integer.parseInt(sc.nextLine());
//        Call(secondsTalk);

    }

    public void allCall(String newModel) {
            GSM tryClass = new GSM();
            this.model = newModel;
            if (model == "iPhone"){

                this.manufacturer = "Apple";
                this.price = 1600;
                this.totalCallNumber = 1000;

                this.batteryModel = "AppleBat";
                this.idleTime = 48; //h
                this.phoneUsageTime = 12; //h

                this.displaySize = "860x400px";
                this.colors = 160000;


            }else if(Objects.equals(model, "Huawei")){
                this.manufacturer = "Huawei";
                this.price = 1000;
                this.totalCallNumber = 500;

                this.batteryModel = "ChineseLion";
                this.idleTime = 64; //h
                this.phoneUsageTime = 32; //h

                this.displaySize = "720x500";
                this.colors = 320000;

            }else if(Objects.equals(model, "Pixel")){
                this.manufacturer = "Google";
                this.price = 800;
                this.totalCallNumber = 650;

                this.batteryModel = "G0bAt";
                this.idleTime = 74; //h
                this.phoneUsageTime = 15; //h

                this.displaySize = "800x360";
                this.colors = 50000;

            }
//            printPhoneDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow long have you talked?");
        int secondsTalk = Integer.parseInt(sc.nextLine());
        Call(secondsTalk);


    }
    public void printPhoneDetails(){

        System.out.printf("\n%s, %.2f, %s, %s, %.2f, %.2f, %.2f, %s, %s",this.manufacturer,this.price,this.totalCallNumber,this.batteryModel,this.idleTime,this.phoneUsageTime,this.phoneUsageTime,this.displaySize,this.colors);


    }


    public void Call(int seconds){
//        GSM callClass = new GSM();
       this.totalCallNumber--;
       this.phoneUsageTime = this.phoneUsageTime - ((double) seconds /3600);

       double[] arr =  {this.totalCallNumber,this.phoneUsageTime};
        System.out.printf("Total call numbers: %.0f #",arr[0]);
        System.out.printf("\nPhone usage time: %.2f h",arr[1]);
//        System.out.printf();
//        System.out.printf("\nRemaining time to use phone: %.2f",callClass.phoneUsageTime);
    }

    public static void main(String[] args) {
        GSM myClass = new GSM();
        myClass.Model("iPhone");
        myClass.Model("Huawei");
        myClass.Model("Pixel");
//        myClass.printPhoneDetails();
//        myClass.Model("iPhone");
//        myClass.Model("Pixel");
//        myClass.Model("Huawei");

    }
}

