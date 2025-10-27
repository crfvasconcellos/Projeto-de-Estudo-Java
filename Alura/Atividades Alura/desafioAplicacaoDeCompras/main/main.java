package main;
import objects.Mercado;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Limite do Cartão: ");
        double limite = sc.nextDouble();


        Mercado mercado = new Mercado(limite);

        int continuar = 1;

        while (continuar == 1 ){


            System.out.println("Digite a Descrição da Compra: ");
            sc.nextLine();
            String nomeDoItem = sc.nextLine();
            System.out.println("Digite o Valor da Compra: ");
            double valorDoItem = sc.nextDouble();

            int foi = mercado.adicionarItem(nomeDoItem,valorDoItem);

            if (foi == 1){
                System.out.println("Não foi possivel realizar a compra devido" +
                        " ao Saldo ser abaixo do Valor");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            continuar = sc.nextInt();


        }


        System.out.println("\n****************");
        System.out.println("COMPRAS RELIZADAS: ");

        for (int i = 0; i < mercado.getQtdItens(); i++) {
            mercado.getItemDeComprados(i);
        }

        System.out.println("****************");

        System.out.printf("\nSaldo do cartão: R$%.2f",mercado.getSaldo());



    }

}
