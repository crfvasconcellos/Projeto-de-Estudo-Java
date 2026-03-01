package Interfaces.Contratos.Services;

public class PaypalService implements OnlinePaymentService{

    public double interest(double amount, int months) {

        double percentage = (double) 1 /100 * amount;
        return months * percentage;

    }

    public double paymentFee(double amount) {

        double percentage = (double) 2/100 * amount;
        return percentage;


    }

}
