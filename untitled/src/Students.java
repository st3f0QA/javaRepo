import java.math.BigDecimal;
import java.util.Scanner;

public class Students {
    public String names;
    public int course;
    public String fieldOfStudy;
    public String university;
    public String email;
    public BigDecimal phoneNumber;
    public String[] friends = new String[2];
}

//    public String printStudentDetails(){
//        Students firstStudent = new Students();
//        Students secondStudent = new Students();
//        Students thirdStudent = new Students();
//        firstStudent.names = "Stefan Tsolov";
//        firstStudent.course = 2;
//        firstStudent.fieldOfStudy ="Aviation";
//        firstStudent.university = "Private college of transportation";
//        firstStudent.email = "stsolov@abv.bg";
//        firstStudent.phoneNumber =new BigDecimal("0888856880");
////        System.out.println("\nfirstStudent.names = " + firstStudent.names);
////        System.out.println("firstStudent.course = " + firstStudent.course);
////        System.out.println("firstStudent.fieldOfStudy = " + firstStudent.fieldOfStudy);
////        System.out.println("firstStudent = " + firstStudent.university);
////        System.out.println("firstStudent = " + firstStudent.email);
////        System.out.println("firstStudent = " + firstStudent.phoneNumber);
//
//
//        secondStudent.names = "Polina Ivanova";
//        secondStudent.course = 4;
//        secondStudent.fieldOfStudy ="Economics";
//        secondStudent.university = "UNSS";
//        secondStudent.email = "pTsolova@abv.bg";
//        secondStudent.phoneNumber =new BigDecimal("0895670243");
////        System.out.println("\nsecondStudent.names = " + secondStudent.names);
////        System.out.println("secondStudent.course = " + secondStudent.course);
////        System.out.println("secondStudent.fieldOfStudy = " + secondStudent.fieldOfStudy);
////        System.out.println("secondStudent.university = " + secondStudent.university);
////        System.out.println("secondStudent.email = " + secondStudent.email);
////        System.out.println("secondStudent.phoneNumber = " + secondStudent.phoneNumber);
//
//
//        thirdStudent.names = "Georgi Ivanov";
//        thirdStudent.course = 1;
//        thirdStudent.fieldOfStudy ="Geodesy";
//        thirdStudent.university = "UACEG";
//        thirdStudent.email = "gIvanov@gmail.com";
//        thirdStudent.phoneNumber =new BigDecimal("0896788564");
//
////        System.out.println("\nthirdStudent.names = " + thirdStudent.names);
////        System.out.println("thirdStudent.course = " + thirdStudent.course);
////        System.out.println("thirdStudent.fieldOfStudy = " + thirdStudent.fieldOfStudy);
////        System.out.println("thirdStudent.university = " + thirdStudent.university);
////        System.out.println("thirdStudent.email = " + thirdStudent.email);
////        System.out.println("thirdStudent.phoneNumber = " + thirdStudent.phoneNumber);
//        return firstStudent.names;
//        return secondStudent.names;
//        return thirdStudent.names;
//
//    public  void StudentTest(int studentNumber){
//        System.out.print("Which student you want to pick? - 1,2,3?");
//        Scanner sc = new Scanner(System.in);
//        studentNumber = Integer.parseInt(sc.nextLine());
//        Students firstStudent = new Students();
//        Students secondStudent = new Students();
//        Students thirdStudent = new Students();
////        secondStudent.names  ="Georgi";
//
//        if (studentNumber == 1){
//            friends[0] = printStudentDetails();
//            friends[1] = thirdStudent.names;
//
//        }
//        else if (studentNumber == 2){
//            friends[0] = firstStudent.names;
//            friends[1] = thirdStudent.names;
//        }
//        else if(studentNumber == 3){
//            friends [0] = firstStudent.names;
//            friends [1] = secondStudent.names;
//
//        }
//        else{
//            System.out.println("Invalid input!!");
//        }
//        System.out.println(friends[1]);
//        for (int i = 0; i < friends.length; i++){
//            System.out.printf("Friend: %s",friends[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Students studDetails = new Students();
//            studDetails.printStudentDetails();
//        studDetails.StudentTest(1);
//
//    }
//}
