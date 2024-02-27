import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a width: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a height: ");
        int b = Integer.parseInt(sc.nextLine());
//        int c = calculate(a,b);
        System.out.printf("The perimeter is: %d", calculate(a,b));

        double doublePerim = calculate((double)a,(double)b);
        System.out.printf("Double perim is: %f",doublePerim);


        int [] arr = {a,b};
        int pArr = calculate(arr);
        System.out.printf("Array = %s ",pArr);

        int number = 4, result; //this is another way to define variables from the same type
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }

    public static int calculate(int a,int b){
        int p = 2*a + 2*b;
        return p;
    }
    public static int calculate(int[] arr){
        int p = 2*arr[0] + 2*arr[1];
        return p;
    }

    public static double calculate(double a, double b){
        return 2*a + 2*b;
    }

    public static void printOnScreen(String info){
        System.out.printf("The info: %s", info);
    }
    public static String newName(String info){
        String name = String.format("The new info is: %s",info);
        System.out.println(name);
//        System.out.printf("The new Info is: %s",info);
        return name;
    }

    static int factorial (int n){
        if (n != 0)
            return n * factorial(n-1);
        else
            return 1;
    }
//    public static void Try() {
//        /*  */
//        obj1.N = new NewClass();
//        obj2.N = new NewClass();
//        obj3.N = new NewClass();
//        NewClass.N = 4;
//        obj1.increment();
//        obj2.increment();
////        obj3.increment();
//
//        System.out.println(NewClass.N);
//
//    }


}

