package ExerciciosClassesEstruturasEMetodos.Att1.src.aplication;

import ExerciciosClassesEstruturasEMetodos.Att1.src.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class programa1 {
    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque a Largura e a Altura do Retangulo: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();


        System.out.println("Área = "+ retangulo.area());
        System.out.println("Perimetro = "+ retangulo.perimeter());
        System.out.println("Diagonal = "+ retangulo.diagonal());

    }
}
