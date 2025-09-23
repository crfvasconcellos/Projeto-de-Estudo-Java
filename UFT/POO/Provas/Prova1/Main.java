package Prova1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque os dados da conta ---");
        System.out.println("Numero da Conta: ");
        int numeroCont = sc.nextInt();
        System.out.printf("Nome do Titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Saldo Inicial: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroCont,nome,saldo);

        System.out.println(conta.toString());

        System.out.println("\n\nEntre o valor de deposito: ");
        conta.depositar(sc.nextDouble());
        System.out.println(conta.toString());


        System.out.println("\n\nQual o valor à Sacar: ");
        conta.sacar(sc.nextDouble());

        System.out.println(conta.toString());


    }
}
