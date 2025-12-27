package Fixacao1.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque a Largura e a Altura do Retangulo: ");
        retangulo.setLargura(sc.nextDouble());
        retangulo.setAltura(sc.nextDouble());

        System.out.printf("\n Area = %.2f ", retangulo.getArea());
        System.out.printf("\n Perimetro = %.2f ",retangulo.getPerimeter());
        System.out.printf("\n Diagonal = %.2f ", retangulo.getDiagonal());

    }
}
