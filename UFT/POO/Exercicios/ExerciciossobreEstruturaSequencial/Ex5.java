package ExerciciossobreEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1,
        //o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o
        //valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double[] peca1;
        peca1 = new double[3];

        double[] peca2;
        peca2 = new double[3];

        double total=1;

        for (int i = 0; i < 3; i++) {
            peca1[i] = leitor.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            peca2[i] = leitor.nextDouble();
        }

        total = (peca1[1] * peca1[2]) + (peca2[1] * peca2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f",total);


    }
}
