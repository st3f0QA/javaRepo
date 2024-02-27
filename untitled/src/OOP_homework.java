public class OOP_homework {
   public int year;
public double price;
public boolean isNotebook; //if true = it's a laptop
public int hardDiskMemory;
public double freeMemory;
public String operationSystem;


    public String changeOperatingSystem(String newOperatingSystem){
//        OOP_homework oop = new OOP_homework();
        this.operationSystem = newOperatingSystem;
        return this.operationSystem;
    }
    public void useMemory(double memory){
//        OOP_homework oop = new OOP_homework();

        if(memory > this.freeMemory || memory> this.hardDiskMemory){
            System.out.println("not enough free memory!");
        }
        else{
            this.freeMemory = this.freeMemory-memory;
        }

    }
    public static class ComputerDemo{
        public static void main(String[] args) {
            OOP_homework comp1 = new OOP_homework();
            comp1.year = 2023;
            comp1.price = 1005; //$
            comp1.hardDiskMemory = 1000; //gb
            comp1.freeMemory = 512; //gb
            comp1.operationSystem = "Windows XP";
            comp1.isNotebook = false;
            comp1.changeOperatingSystem("Mac OS");

            OOP_homework comp2 = new OOP_homework();
            comp2.year = 2021;
            comp2.price = 860; //$
            comp2.hardDiskMemory = 500; //gb
            comp2.freeMemory = 400; //gb
            comp2.operationSystem = "Ubuntu";
            comp2.isNotebook = true; //it's a laptop
            comp2.useMemory(100);

            System.out.printf("The year of second computer is: %d\n", comp2.year);
            System.out.printf("The price of second computer is: %.2f\n", comp2.price);
            System.out.printf("The hardDiskMemory of second computer is: %.2f\n", comp2.freeMemory);
            System.out.printf("The OS of second computer is: %s\n", comp2.operationSystem);
            System.out.printf("The computer is a laptop: %b\n", comp2.isNotebook);


        }
    }
}


