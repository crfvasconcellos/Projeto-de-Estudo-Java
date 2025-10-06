package ExercicioVetores;
import java.util.Locale;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        sc.close();
    }
}


