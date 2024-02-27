package newPackage;

//package soft.academy;

public class Company {
    private String name;
    private int age;

    public Company(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void companyGreeting(){
        System.out.printf("Welcome to Company %s \n", this.name);
    }

    public int ageCompanyPlusTen(){
        return this.age + 10;

    }

    public static void main(String[] args) {
        Company c = new Company("stefan",28);

        c.companyGreeting();
        System.out.println(c.ageCompanyPlusTen());
//        c.ageCompanyPlusTen();
    }
}
