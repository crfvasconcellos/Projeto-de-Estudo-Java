import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de Lançamento? ");
        int ano = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme de 0 à 10: ");

        double avali = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println("Nota: " + avali);
    }
}
