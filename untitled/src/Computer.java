public class Computer{
  int year;
  double price;
  boolean isNotebook; //if true = it's a laptop
  int hardDiskMemory;
  double freeMemory;
  String operationSystem;


  public void changeOperationSystem(String newOperationSystem){
      operationSystem = newOperationSystem;
      System.out.printf("The operation system is: %s",newOperationSystem);
  }
  public void useMemory(double memory){
      freeMemory = freeMemory - memory;
      if(freeMemory > 0){
          System.out.printf("The remaining memory is: %.2f\n", freeMemory);

      }
      else if(freeMemory == 0 ){
          System.out.printf("Be careful! The memory is: %.2f\n", freeMemory);
      }
      else{
          System.out.print("There is no free memory!");
      }
  }


    public static void main(String[] args) {
//        System.out.println("Computer 1");
//        Computer comp1 = new Computer();
//        comp1.year = 2023;
//        System.out.printf("%d\n",comp1.year);
//        comp1.price = 865.2D;
//        System.out.printf("The price is: %.2f\n",comp1.price);
//        comp1.hardDiskMemory = 500;
//        System.out.printf("The harddisk memory is: %d\n",comp1.hardDiskMemory);
//        comp1.operationSystem = "Windows XP";
//        System.out.printf("The opartion system is: %s\n",comp1.operationSystem);
////        comp.changeOperationSystem("Ubuntu");
//        comp1.freeMemory = 400;
//        comp1.useMemory(100);
//        comp1.isNotebook = true;
//        System.out.printf("It's a laptop: %b\n",comp1.isNotebook);
//
//
//        System.out.println("Computer 2");
//        Computer comp2 = new Computer();
//        comp2.year = 1995;
//        System.out.printf("%d\n",comp2.year);
//        comp2.price = 30.2;
//        System.out.printf("The price is: %.2f\n",comp2.price);
//        comp2.hardDiskMemory = 400;
//        System.out.printf("The harddisk memory is: %d\n",comp2.hardDiskMemory);
//        comp2.operationSystem = "Ubuntu";
//        comp2.changeOperationSystem("Mac OS\n");
//        comp2.freeMemory = 500;
//        System.out.println(comp2.freeMemory);
////        comp2.useMemory(400);
//        comp2.isNotebook = false;
//        System.out.printf("It's a laptop: %b",comp2.isNotebook);

    }
}