import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class scanner {
    public static void firstTask() {
        String name = "Stefan";
        int age = 18;
        float randNumber = 4.56f;
        double number = 4.56;
        boolean flag = true;
        char once = 'h';


    }

    public static void secondTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your first number is: ");
        int firstNumber = sc.nextInt();

        System.out.print("Your second number is: ");
        int secondNumber = sc.nextInt();
        //sum of both
        int sumOfBoth = firstNumber + secondNumber;
        //subtraction
        int subOfBoth = firstNumber - secondNumber;
        //multiplication
        int multiOfBoth = firstNumber * secondNumber;
        //division
        int divOfBoth = firstNumber / secondNumber;
        System.out.printf("Sum is: %d \n", sumOfBoth);
        System.out.printf("Subtraction is: %d\n", subOfBoth);
        System.out.printf("Multiplication is: %d\n", multiOfBoth);
        System.out.printf("Division is: %d\n", divOfBoth);


    }

    public static void thirdTask() {
        int a = 5;
        int b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
//        System.out.println(b);
    }

    public static void fourthTask() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d;
        d = c;
        c = a; //1
        a = b; //2
        b = d; //1
        System.out.println(a + " " + b + " " + c);
    }

    public static void fifthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many degrees it is: ");
        double degrees = sc.nextDouble();

        double farenheit = degrees * 9 / 5 + 32;
        System.out.printf("The conversion is ready! It's: %.1f F", farenheit);

    }

    public static void sixthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What value you want to convert? ");
        double money = sc.nextDouble();
        double euro = money * 1.96;
        System.out.printf("The value in leva is: %.2f", euro);
    }

    public static void seventhTask() {
        double negative = -1;
        int whole = 34893434;
        float negativeBigger = -129;
        int wholeBigger = 250;
        boolean flag = false;
        String randomBig = "94938483434";
        char randomChar = '$';
        char randomChar2 = '@';
        String name = "java";
        char letter = 'J';


    }

    public static void eigthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the student's name? ");
        String firstName = sc.next();

        System.out.print("What is his/hers father's name? ");
        String fatherName = sc.next();

        System.out.print("What is student's lastname? ");
        String lastName = sc.next();

        System.out.print("What is student's number?");
        String number = sc.next();

        System.out.print("What is student's email address? ");
        String email = sc.next();

        System.out.print("What is his birthplace? ");
        String birthplace = sc.next();

        System.out.print("What is the student's gender? ");
        String gender = sc.next();

        System.out.print("How old is the student? ");
        int age = sc.nextInt();

        System.out.println(firstName + " " + fatherName + " " + lastName + " " + number + " " + email + " " + birthplace + " " + gender + " " + age);
    }

    public static void ninthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number you want to be checked - ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("it's even");
        } else {
            System.out.println("it's odd");
        }
    }

    public static void tenthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number that you want to be checked - ");
        double number = sc.nextDouble();

        if (number % 10 == 7) {
            System.out.println("Yes,the last digit is 7");
        } else {
            System.out.println("No, the last digit is not 7");
        }
    }

    public static void eleventhTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How long is the side A - ");
        double sideA = sc.nextDouble();

        System.out.print("How long is the side B - ");
        double sideB = sc.nextDouble();

        double perimeter = sideA * 2 + sideB * 2;
        System.out.printf("The perimeter is %.2f", perimeter);
    }

    public static void twelfthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How long is the side A - ");
        double sideA = sc.nextDouble();

        System.out.print("How long is the side B - ");
        double sideB = sc.nextDouble();

        double area = sideA * sideB;
        System.out.printf("The area is %.2f", area);


    }

    public static void thirteenthTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How long is the Radius - ");
        double radius = sc.nextDouble();

        double area = radius * Math.PI;
        System.out.printf("The area is %.2f", area);
    }

    public static void takeNumbers() {
    int[] array = new int[7];
    Scanner sc = new Scanner(System.in);
    double getNum;
    int sum = 0 ;
    for (int i = 0; i<array.length; i++){
        System.out.print("Enter new value: ");
        array[i] = sc.nextInt();
        sum += array[i];
    }
        System.out.print(sum);

    }
    public static void minimumMaximum(){

        int[] newArray = new int[7];
        Scanner sc = new Scanner(System.in);
        double getNum;
//        int sum = 0
        int max = 0;
        int minNumber = 0;

        System.out.println(minNumber);
    // инициализацията трябва да е след масива  И ни трябват два for loop-a
        for (int i = 0; i<newArray.length; i++){
            System.out.print("Enter new value: ");
            newArray[i] = sc.nextInt();
//            max = array[i];
//             min = array[i];

            if(minNumber == 0){
                minNumber =newArray[0];
            }
            if(max < newArray[i]){
                max = newArray[i];
            }
            if (minNumber > newArray[i]){
                minNumber = newArray[i];
            }
        }System.out.println("max number is: " + max);
        System.out.println("min number is: " + minNumber);
    }
    public static void main(String[] args) {
        minimumMaximum();
//        takeNumbers();
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        fifthTask();
//        sixthTask();
//        seventhTask();
//        eigthTask();
//        ninthTask();
//        tenthTask();
//        eleventhTask();
//        twelfthTask();
//        thirteenthTask();
//        String[] arr = { "false","true","deaznam","arewe"};
//        for(String word: arr){
//            System.out.println(word);
//        }
//
//        double[] array = {1.4, 2.3, 3.3, 4.2, 5.1, 6.4, 7.9, 0.2, 8.9, 10};
//        System.out.println(Arrays.toString(array));
////        Scanner db = new Scanner(System.in);
////        int[] array = new int [10];
//        //foreach in array
//        for(double num: array) {
//            System.out.println(num);
//        }
//    }
//
//        System.out.print("Your first name: ");
//        String firstName = db.next();
//        System.out.print("Your last name: ");
//        String lastName = db.next();
//
//        System.out.printf("Greetings, %s and %s", firstName, lastName);
    }
}



