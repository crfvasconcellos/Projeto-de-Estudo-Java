package ExercicioVetores;
import java.util.Scanner;


public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        int contPares = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                contPares++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + contPares);

        sc.close();
    }
}


