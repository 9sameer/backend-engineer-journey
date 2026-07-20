class Student {
    String name;
    ;
    int age;

    void introduce() {
        System.out.println("HI " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "sam";
        s1.age = 24;
        s2.name = "ali";
        s2.age = 30;
        s1.introduce();
        s2.introduce();

    }
}