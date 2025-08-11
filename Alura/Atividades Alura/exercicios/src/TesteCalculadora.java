import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite um número:");
        int num = leitor.nextInt();

        System.out.println("O dobro dele é " + calc.dobrar(num));


    }
}
