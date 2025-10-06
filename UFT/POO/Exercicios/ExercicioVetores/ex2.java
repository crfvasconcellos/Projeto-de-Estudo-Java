package ExercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int qtd = sc.nextInt();

        double[] num = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um numero: ");
            num[i] = sc.nextDouble();

        }

        System.out.printf("Valores =  ");
        double soma = 0;
        double media;

        for (int i = 0; i < qtd; i++) {
            System.out.printf("%.2f ",num[i]);
            soma = num[i] + soma;
        }

        media = soma / qtd;

        System.out.printf("\nSOMA = %.2f",soma);
        System.out.printf("\nMEDIA = %.2f",media);

        }

    }

