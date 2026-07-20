class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "sameer";

        Student t = s;
//        Student t = new Student();

        t.name = "Backend_Engineer";

        System.out.println(s.name);


    }
}