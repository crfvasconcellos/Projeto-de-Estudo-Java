package ExerciciossobreEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);



        double raio = leitor.nextDouble();

        double pi =  3.14159;

        double area = pi * (raio*raio);

        System.out.printf("\nA = %.4f ",area);


    }
}
