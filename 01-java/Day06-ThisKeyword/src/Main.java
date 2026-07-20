class Customer {

    String name;

    Customer(String name) {

        this.name = name;

    }

    void display() {

        System.out.println(name);

    }

}

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Sameer");

        Customer c2 = new Customer("Ali");

        c1.display();

        c2.display();

    }

}