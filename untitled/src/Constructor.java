public class Constructor {
    private int age;
    private String name;
    private String egn;

    public Constructor(){
        this.age = 2;
    }
    //overloading of classes
    public Constructor(int age){
        this.age = age;
    }


    //properties
    ///get
    public int getAge(){
        return this.age;
    }
    ///set
    public void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.getAge()); // private field + public property
    }
}

