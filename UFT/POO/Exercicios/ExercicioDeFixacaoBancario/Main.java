package ExercicioDeFixacaoBancario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Haverá depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        ContaBancaria conta;
        if (resposta == 's') {
            System.out.print("Informe o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numero, titular);
        }

        System.out.println("\nDados da conta:");
        System.out.println(conta);

        System.out.print("\nInforme um valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        System.out.print("\nInforme um valor para saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        sc.close();
    }
}
