package Vetores.negativos;

import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja-se digitar? ");
        int qtd = sc.nextInt();

        int [] negativos = new int[qtd];
        int qtdn = 0;
        for (int i = 0; i < qtd; i++) {

            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if(numeros[i] < 0){
                negativos[qtdn] = numeros[i];
                qtdn++;
            }


        }

        System.out.println("Numeros Negativos = ");

        for (int i = 0; i < qtdn; i++ ){

            System.out.printf("\n%d",negativos[i]);

        }





    }
}
