package TratamentoDeExcecoes.ContaBancaria.Aplication;

import TratamentoDeExcecoes.ContaBancaria.Model.Entities.Account;
import TratamentoDeExcecoes.ContaBancaria.Model.Exceptions.UpperWithDrawException;

import java.util.Locale;
import java.util.Scanner;

public class MainAccountComExcecoes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da Conta ");
        System.out.println("Número: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double initialbalance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawlimit = sc.nextDouble();

        Account account = new Account(number,holder,initialbalance,withdrawlimit);

        try{
            System.out.println("Qual o valor a ser sacado? ");
            account.withdraw(sc.nextDouble());

        } catch (UpperWithDrawException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unxpected error");
        }


        sc.close();

    }
}
