import java.math.BigDecimal;

public class StudentTest {
    private void printThisStudents(){
        Students print = new Students();
        Students firstStudent = new Students();
        Students secondStudent = new Students();
        Students thirdStudent = new Students();
        firstStudent.names = "Elka Petrova";
        firstStudent.course = 1;
        firstStudent.fieldOfStudy ="Maths";
        firstStudent.university = "SMG";
        firstStudent.email = "calculator@abv.bg";
        firstStudent.phoneNumber =new BigDecimal("4566488");
        System.out.println("\nfirstStudent.names = " + firstStudent.names);
        System.out.println("firstStudent.course = " + firstStudent.course);
        System.out.println("firstStudent.fieldOfStudy = " + firstStudent.fieldOfStudy);
        System.out.println("firstStudent = " + firstStudent.university);
        System.out.println("firstStudent = " + firstStudent.email);
        System.out.println("firstStudent = " + firstStudent.phoneNumber);


        secondStudent.names = "Valentin Oslov";
        secondStudent.course = 5;
        secondStudent.fieldOfStudy ="Cooking";
        secondStudent.university = "TUES";
        secondStudent.email = "osVal@abv.bg";
        secondStudent.phoneNumber =new BigDecimal("1325646");
        System.out.println("\nsecondStudent.names = " + secondStudent.names);
        System.out.println("secondStudent.course = " + secondStudent.course);
        System.out.println("secondStudent.fieldOfStudy = " + secondStudent.fieldOfStudy);
        System.out.println("secondStudent.university = " + secondStudent.university);
        System.out.println("secondStudent.email = " + secondStudent.email);
        System.out.println("secondStudent.phoneNumber = " + secondStudent.phoneNumber);


        thirdStudent.names = "Grigorii Dimitrov";
        thirdStudent.course = 3;
        thirdStudent.fieldOfStudy ="Architecture";
        thirdStudent.university = "SGSAG";
        thirdStudent.email = "gDim@gmail.com";
        thirdStudent.phoneNumber =new BigDecimal("456488");

        System.out.println("\nthirdStudent.names = " + thirdStudent.names);
        System.out.println("thirdStudent.course = " + thirdStudent.course);
        System.out.println("thirdStudent.fieldOfStudy = " + thirdStudent.fieldOfStudy);
        System.out.println("thirdStudent.university = " + thirdStudent.university);
        System.out.println("thirdStudent.email = " + thirdStudent.email);
        System.out.println("thirdStudent.phoneNumber = " + thirdStudent.phoneNumber);



    }
    public static void main(String[] args) {
        StudentTest test = new StudentTest();
        test.printThisStudents();
    }



}
