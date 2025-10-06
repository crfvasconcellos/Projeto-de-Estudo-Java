package ExercicioVetores;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine(); // limpa o buffer
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelho = idades[0];
        int posicaoMaisVelho = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                posicaoMaisVelho = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaoMaisVelho]);

        sc.close();
    }
}
