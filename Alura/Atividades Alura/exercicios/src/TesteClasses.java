import java.util.Scanner;

public class TesteClasses {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        pessoa1.nome = leitor.nextLine();
        System.out.println("Qual a sua idade?");
        pessoa1.idade = leitor.nextInt();

        pessoa1.digaOla();
        pessoa1.showDados();

    }
}
