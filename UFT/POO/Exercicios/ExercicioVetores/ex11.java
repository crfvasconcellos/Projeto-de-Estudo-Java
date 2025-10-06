package ExercicioVetores;
import java.util.Locale;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            generos[i] = sc.next().toUpperCase().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        for (int i = 0; i < n; i++) {
            if (generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                contMulheres++;
            } else if (generos[i] == 'M') {
                contHomens++;
            }
        }

        double mediaMulheres = somaAlturaMulheres / contMulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }

}
