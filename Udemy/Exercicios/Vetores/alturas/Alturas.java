package Vetores.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão cadastradas? ");
        int qtd = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[qtd];

        double totalaltura = 0;
        int menos16 = 0;

        for (int i = 0; i < qtd; i++) {
            pessoas[i] = new Pessoa();
            System.out.printf("Dados da %d pessoa:\n ",i+1);
            System.out.print("\nNome : ");
            sc.nextLine();
            pessoas[i].setNome(sc.nextLine());
            System.out.printf("Idade: ");
            pessoas[i].setIdade(sc.nextInt());

            if (pessoas[i].getIdade() < 16){
                menos16++;
            }

            System.out.print("Altura: ");
            pessoas[i].setAltura(sc.nextDouble());
            totalaltura = totalaltura + pessoas[i].getAltura();

        }


        System.out.print("\n\n");
        double media = totalaltura / qtd;
        System.out.printf("\nAltura média = %.2f ",media);
        double menos16porcentagem = (double) menos16* 100/qtd ;
        System.out.printf("\nPessoas com menos de 16 anos = %.2f%% ",menos16porcentagem);


    }




}
