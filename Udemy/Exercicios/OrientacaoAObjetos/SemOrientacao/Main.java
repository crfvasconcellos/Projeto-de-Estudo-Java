import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] x = new double[3];
        double[] y = new double[3];

        System.out.println("Coloque os valores de X: ");

        for (int i = 0 ; i < 3; i++){
            x[i] = sc.nextDouble();
        }
        System.out.println("Coloque os valores de Y: ");
        for (int i = 0 ; i < 3; i++){
            y[i] = sc.nextDouble();
        }

        double resultx = showArea(x[0],x[1],x[2]);
        double resulty = showArea(y[0],y[1],y[2]);

        System.out.printf("\nArea do Triangulo X = %.2f", resultx);
        System.out.printf("\nArea do Triangulo Y = %.2f", resulty);

        if (resultx > resulty){
            System.out.printf("\nArea maior= X");
        }
        else{
            System.out.println("\nArea maior = Y");
        }


    }

    public static double showArea(double x1 , double x2 , double x3){

        double p = (x1 + x2 + x3)/2;

        double result = p * (p-x1) * (p - x2) * (p-x3);
        result = Math.sqrt(result);

        return  result;

    }

}
