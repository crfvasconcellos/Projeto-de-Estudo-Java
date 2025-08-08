import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("======= Dados do Cliente ======= ");
        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Qual o seu tipo de Conta?\n (1)-Corrente\n (2)" +
                "-Poupança" +
                " ");
        int tipodeconta = leitor.nextInt();
    }
}
