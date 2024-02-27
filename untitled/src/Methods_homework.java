import java.util.Scanner;

public class Methods_homework {
    public static void main(String[] args) {
//        printName();
//        System.out.println(max(20,10));
//        System.out.println(min(15,13));
//        System.out.println(sum(15,40));
//        System.out.println(multi((short)5,(short)4));
//        System.out.println(maxFromThree());
//            createArray(10);
//        System.out.print(sumElements(new int[]{15, 14 ,1 }));
//        System.out.println(contains(new int[]{15,14,1},1));
//        System.out.println(countOccurrences(new int[]{15,14,1,1,1,1,1},15));
//            printElements(new int[]{14,13,12,18,19});
//        System.out.println((countDigits(22222)));
//        System.out.println(isPrime(3));
//        if (getParity(381) == true){
//            System.out.printf("even");
//        }else{
//            System.out.printf("odd");
//        }
//        System.out.println(getParity(381));
//        createNewArray(123456);
    }



    public static void createNewArray(int number){
//        int i = 0;
            int counter = 0;
        while (number > 0){
            int digit = number % 10;
            System.out.println(digit);

            number = number / 10;
        }

    }
    public static void printName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.printf("Hello, %s", name);

    } //1st task

    public static int max(int a, int b) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("What is your first number? ");
//        a = Integer.parseInt(sc.nextLine());
//        System.out.print("What is your second number?");
//        b = Integer.parseInt(sc.nextLine());

        if (a > b){
            return a;
        }else{
            return b;
        }
    } //2nd task a)
    public static double min(int a, int b){
        if (a < b){
            return a;
        }else{
            return b;
        }
    } //2nd task b)
    public static long sum(long a, long b){
        long sumOfTwo = a + b;
        return  sumOfTwo;
    } //2nd task c)
    public static short multi(short a, short b){
        short multiply = (short) (a * b);
        return multiply;
    }//2nd task d)
    public static int maxFromThree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your first number? ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("What is your second number? ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("What is your third number? ");
        int c = Integer.parseInt(sc.nextLine());

        int max = 0;
        if (a >= b && a >= c){
            max = a;
        }else if(b >= a && b >= c){
            max = b;
        }else if(c >= a && c >= b){
            max = c;
        }


        return max;

    }
    public static void createArray(int size){
        int[] arr = new int[size];
//        System.out.print(arr.length);
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(i);
        }



    }
   public static int sumElements(int[] array){
       int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
   }
   public static boolean contains(int[] array, int element){
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                flag = true;
            }else{
                flag = false;
            }

        }
        return flag;
   }
   public static int countOccurrences(int[] array, int element){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                counter++;
            }
        }
        return  counter;
   }
    public static void printElements(int[] array){
        int m =0;
        int i =array.length-1;
        int[] newArray = new int[array.length];
        System.out.print("[");
        while(i >= 0){
            if (i == 0){
                System.out.printf ("%s",array[i]);
            }
            else{
                System.out.printf ("%s,",array[i]);
            }

            i--;

        }
        System.out.print("]");


//        for (int i = 0; i < array.length; i++){
//            m = array[i];
//        }

        return ;
    }
    public static int countDigits(int number){
        return String.valueOf(number).length();
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(number); i++){
            if (number % i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean getParity(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
