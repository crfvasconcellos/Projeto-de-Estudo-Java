package ExerciciosClassesEstruturasEMetodos.Att3.src;

import java.util.Locale;
import java.util.Scanner;

public class programa3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();


        System.out.printf("\n Nota final: %.2f pontos ",estudante.notaFinal());

        if (estudante.notaFinal() < 60.0) {
            System.out.println("Reporvado!");
            System.out.printf("Faltam %.2f pontos\n", estudante.pontosFaltasndo());
        }
        else {
            System.out.println("Passou!!!");
        }
    }
}
