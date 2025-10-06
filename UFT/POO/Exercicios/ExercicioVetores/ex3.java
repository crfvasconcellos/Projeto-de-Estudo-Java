package ExercicioVetores;
import java.util.Locale;
import java.util.Scanner;

public class ex3 {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    String[] nomes = new String[n];
    int[] idades = new int[n];
    double[] alturas = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Dados da " + (i + 1) + "a pessoa:");
        System.out.print("Nome: ");
        sc.nextLine();
        nomes[i] = sc.nextLine();
        System.out.print("Idade: ");
        idades[i] = sc.nextInt();
        System.out.print("Altura: ");
        alturas[i] = sc.nextDouble();
    }

    double somaAlturas = 0.0;
    int contMenores = 0;

    for (int i = 0; i < n; i++) {
        somaAlturas += alturas[i];
        if (idades[i] < 16) {
            contMenores++;
        }
    }

    double mediaAltura = somaAlturas / n;
    double porcentagemMenores = ((double) contMenores / n) * 100.0;

    System.out.printf("Altura média: %.2f%n", mediaAltura);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores);

    for (int i = 0; i < n; i++) {
        if (idades[i] < 16) {
            System.out.println(nomes[i]);
        }
    }

}
}
