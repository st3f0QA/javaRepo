import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops_and_arrays {
    public static void firstTask() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What should be the size of the array ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();


        }
        for(int num : arr){
            System.out.println(num);
        }

    }
    public static void secondTask(){
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[5];
        System.out.println("Fill your array: ");
        for (int i = 0; i < arr.length; i++){
            int number = Integer.parseInt(sc.nextLine());

            arr[i] = number;
        }

        int max = arr[0];
        int min = arr[0];
//        System.out.println(max);
//        System.out.println(min);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("Max number is: %s\n",max);
        System.out.printf("Min number is: %s", min);



    }
    public static void thirdTask(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the size of the array - odd: ");
        int size = Integer.parseInt(sc.nextLine());
        if (size % 2 == 0){
            System.out.println("Wrong input!!");
        }
        else{
            int arr[] = new int[size];
            System.out.println("Fill your array: ");
            for (int i = 0; i < arr.length; i++){
                int number = Integer.parseInt(sc.nextLine());
                arr[i] = number;
            }

            int max = arr[0];
            int min = arr[0];
            int sum = 0;
            int multiply = 1;
//        System.out.println(max);
//        System.out.println(min);
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
                if(arr[i]<min) {
                    min = arr[i];
                }
                 sum += arr[i];
                multiply *= arr[i];
            }
            int average = (int)Math.ceil(arr.length) / 2;
            int averageElement = arr[average];


            System.out.printf("Max number is: %s\n",max);
            System.out.printf("Min number is: %s", min);
            System.out.printf("\nAverage number is: %s",averageElement);
            System.out.printf("\nSum of all elements is: %s", sum);
            System.out.printf("\nMultiplication of all elements is: %s",multiply);
        }



    }
    public static void fourthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of the array");
        int size = Integer.parseInt(sc.nextLine());
        double[] arr = new double[size];
        System.out.println("What number you want to check?");
        double checkNumber = Double.parseDouble(sc.nextLine());
        System.out.println("What are you numbers in the array? ");
        int counter = 0;
        for(int i = 0; i<arr.length; i++){
            double number = Double.parseDouble(sc.nextLine());
            if(number == checkNumber){
                counter++;
            }
        }
        System.out.printf("Your number is in the array %s times", counter);
    }
    public static void fifthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of the array? ");
        int size = Integer.parseInt(sc.nextLine());
        double[] arr = new double[size];

        System.out.println("What are the numbers in your array? ");
        for (int i = 0; i < arr.length; i++){
            double number = Double.parseDouble(sc.nextLine());
            arr[i] = number;
        }
        System.out.println("What is the operation you want to check? ");
        String symbolInput = sc.nextLine();
        char symbol = symbolInput.charAt(0);
        double finalResult = 0;
        double notFinalResult = 0;
        double multiplyDeletion = 1;
        for (double result : arr){
            if(symbol == '+'){
                notFinalResult += result;
            }
            else if( symbol == '-'){

                notFinalResult = notFinalResult - result  ;
//                System.out.printf("This is the result %s", result);
            }
            else if( symbol == '*'){

                multiplyDeletion *= result;
                notFinalResult = multiplyDeletion;
            }
            else if( symbol == '/'){
                System.out.println(result);
                multiplyDeletion =  multiplyDeletion / result ;
                notFinalResult = multiplyDeletion;
            }
            else{
                System.out.println("INVALID OPERATION");
            }
            finalResult = notFinalResult;
        }
        System.out.println(finalResult);



    }
    public static void sixthTask(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Fill your array: ");
        for (int i = 0; i < arr.length; i++){
            int number = Integer.parseInt(sc.nextLine());
            arr[i] = number;
        }
        System.out.printf("Inverted array is: " );
        for (int i = arr.length-1; i >-1; i--){
            System.out.printf("\n%s",arr[i]);
        }

    }
    public static void eigthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number (atleast two digit)? ");
        String number =sc.nextLine();
        int parsedNumber = Integer.parseInt(number);
        int size = number.length();
        int arr[] = new int[size];
        if (parsedNumber >= 10){
            int counter = -1;
            while (parsedNumber > 0 ){
                if(counter >= arr.length-1){
                    break;
                }else{
                    counter++;
                }//
               int digit = (int)parsedNumber % 10;
                parsedNumber = parsedNumber /10;
//                System.out.println(digit);
               arr[counter] = digit;

            }
            for (int i = arr.length-1; i >= 0; i--){
                if(i == 0){
                    System.out.printf("%s", arr[i]);
                }
                else{
                    System.out.printf("%s,", arr[i]);
                }

            };
        }else{
            System.out.println("Your number is not valid!!");
        }

    }

    public static void main(String[] args){
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        fifthTask();
//        sixthTask();
    eigthTask();


    }

}
