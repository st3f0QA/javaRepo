public class inheritance {
    String afk = "afk";
    void speak(){
        System.out.println("I talk");

    }

    public static void main(String[] args) {
        inheritance m = new inheritance();
        student s = new student();
        m.speak();
        s.speak();
    }
}
