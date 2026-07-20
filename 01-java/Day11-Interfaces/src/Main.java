interface PaymentService {
    void pay();
}

class UpiPaymentService implements PaymentService {
    public void pay() {
        System.out.println("UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new UpiPaymentService();
        paymentService.pay();

    }
}