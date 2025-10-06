package ExercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int qtd = sc.nextInt();

        int[] num = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < qtd; i++) {
            if (num[i] < 0 ){

                System.out.println(num[i]);

            }
        }

    }
}
