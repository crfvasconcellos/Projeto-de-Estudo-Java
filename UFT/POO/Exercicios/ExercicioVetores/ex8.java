package ExercicioVetores;
import java.util.Locale;
import java.util.Scanner;


public class ex8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int somaPares = 0;
        int contPares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contPares++;
            }
        }

        if (contPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) somaPares / contPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }

        sc.close();
    }

}
