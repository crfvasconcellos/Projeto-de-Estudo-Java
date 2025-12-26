import Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class MainObjetos {
    public static void main(String[] args) {

        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque os valores de X: ");

        trianguloX.a = sc.nextDouble();
        trianguloX.b = sc.nextDouble();
        trianguloX.c = sc.nextDouble();

        System.out.println("Coloque os valores de Y: ");

        trianguloY.a = sc.nextDouble();
        trianguloY.b = sc.nextDouble();
        trianguloY.c = sc.nextDouble();

        double resultx = trianguloX.getArea();
        double resulty = trianguloY.getArea();

        System.out.printf("\nArea do Entities.Triangulo X = %.2f", resultx);
        System.out.printf("\nArea do Entities.Triangulo Y = %.2f", resulty);

        if (resultx > resulty){
            System.out.printf("\nArea maior= X");
        }
        else{
            System.out.println("\nArea maior = Y");
        }

    }
}
