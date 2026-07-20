
class Policy {

    void calculatePremium() {

        System.out.println("Generic");

    }

}

class HealthPolicy extends Policy {

    @Override
    void calculatePremium() {

        System.out.println("Health");

    }

}

public class Main {

    public static void main(String[] args) {

        Policy p = new HealthPolicy();

        p.calculatePremium();

    }

}