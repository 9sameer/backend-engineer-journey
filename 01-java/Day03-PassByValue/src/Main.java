class Student {
    String name;
}

public class Main {
    static void change(Student x) {
        x = new Student();
        x.name = "sameer";
    }

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ali";
        change(s);
        System.out.println(s.name);


        int a = 10;
        change(a);
        System.out.println(a);

    }
}


