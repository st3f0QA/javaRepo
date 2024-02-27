import java.util.Scanner;

public class HomeWork_Loops {
    public static void firstTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        int get = age;
        if( get >= 18){
            System.out.print("You are above 18!");
        }
        else {
            System.out.print("You are under 18!!");
        }
    }
    public static void secondTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your number? ");
        int number = sc.nextInt();
        int lastDigit = number % 10;

        System.out.printf("The last digit of your number: %s is: %s", number,lastDigit);





    }
    public static void thirdTask(){
        try{
        System.out.print("What is your grade? ");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.printf("Number %s",number);
        double grade = Integer.parseInt(number);
        if( grade >= 5.5 && grade <= 6){
            System.out.print("You are an excellent student! ");
        }
        else if(grade < 5.5 && grade >=4.5){
            System.out.print("You are a good student!");

        }
        else if(grade < 4.5 && grade >= 3.5){
            System.out.print("You have to pay attention to your grades! ");
        }
        else if(grade < 3.5 && grade >= 3){
            System.out.print("I'm not happy at all!! " );
        }
        else if (grade < 3 && grade  >= 2){
            System.out.print("You are a poor student!");
        }
        else{
            System.out.println("Invalid value!");
        }
        }catch(Exception e){

            System.out.println("Invalid input");
        }
    }
    public static void thirdTaskSecondTry(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your grade? ");

        try {
            double grade = Double.parseDouble(sc.nextLine());

            if (grade >= 5.5 && grade <= 6) {
                System.out.print("You are an excellent student! ");
            } else if (grade < 5.5 && grade >= 4.5) {
                System.out.print("You are a good student!");
            } else if (grade < 4.5 && grade >= 3.5) {
                System.out.print("You have to pay attention to your grades! ");
            } else if (grade < 3.5 && grade >= 3) {
                System.out.print("I'm not happy at all!! ");
            } else if (grade < 3 && grade >= 2) {
                System.out.print("You are a poor student!");
            } else {
                System.out.println("Invalid value!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric grade.");
        }
    }
    public static void fourthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello what is your name? ");
        String name = sc.nextLine();
//        String name = nameInput.toLowerCase();
        System.out.print("And what is your gender? ");
        String genderInput = sc.nextLine();
        String gender = genderInput.toLowerCase();

        if (gender.equals("male") || gender.equals("man")){
            System.out.printf("Hello, Mr %s", name);
        }
        else if(gender.equals("female") || gender.equals("woman")){
            System.out.printf("Hello, Ms %s", name);
        }
        else{
            System.out.println("Invalid input!");

        }
    }
    public static void fifthTask(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character ");
        char userChar = sc.nextLine().charAt(0);
        int asciiValue = (int) userChar;

        if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println("ASCII indicates a digit.");
        } else if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
            System.out.println("ASCII indicates a letter.");
        } else {
            System.out.println("ASCII indicates a non-alphanumeric character.");
        }

    }
    public static void ninthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Type a second number higher than the previous: ");
        int secondNumber = Integer.parseInt(sc.nextLine());
        if (firstNumber >= secondNumber){
            System.out.print("Wrong input!!");
        }



        else{
            System.out.print("Type a number you want to be checked ");
            int thirdNumber = Integer.parseInt(sc.nextLine());
            if(thirdNumber <= firstNumber){
                System.out.printf("It's not in the interval %d and %d",firstNumber,secondNumber);
            }
            else if(thirdNumber > firstNumber && thirdNumber < secondNumber){
                System.out.printf("It's in the interval %d and %d",firstNumber,secondNumber);
            }
            else if(firstNumber >= thirdNumber){
                System.out.printf("It's not in the interval %d and %d",firstNumber,secondNumber);
            }
        }

    }
    public static void eleventhTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first number: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("What is your second number: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("What is your third number: ");
        double c = Double.parseDouble(sc.nextLine());
        double D;
        double x1;
        double x2;
        double discrimant = Math.pow(b,2) - 4 * a * c;
        // a^2 + b + c = 0  d = b^2 - 4ac
        D = discrimant;
        System.out.println(discrimant);
        x1 = - b - Math.sqrt(discrimant);
        x2 = - b + Math.sqrt(discrimant);
        System.out.printf("x1 = %f , x2 = %f",x1,x2);

    }
    public static void fifthTeenthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number ");
        int number = Integer.parseInt(sc.nextLine());
        if (number < 0){
            System.out.print("Invalid number");
        }
        else{
            int square = (int) Math.sqrt(number);
            System.out.println(square);
            if (square * square == number){
                System.out.println("It's a square number!! ");
            }
            else {
                System.out.println("It's not a square number!!!");
            }
        }
    }

    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        thirdTaskSecondTry();
//        fourthTask();
//        fifthTask();
//        ninthTask();
//    eleventhTask();
        fifthTeenthTask();

    }





}
