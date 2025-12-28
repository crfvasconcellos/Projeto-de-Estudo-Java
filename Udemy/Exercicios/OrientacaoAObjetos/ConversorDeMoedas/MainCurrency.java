import java.util.Locale;
import java.util.Scanner;

public class MainCurrency {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dolar? ");
        double dollarprice = sc.nextDouble();
        System.out.println("Quantos dolares vão ser retirados? ");
        double dollarquantity = sc.nextDouble();
        System.out.printf("\n Você terá que pagar = R$ %.2f ",
                CurrencyConverter.RealConverter(dollarprice,dollarquantity));



    }
}
