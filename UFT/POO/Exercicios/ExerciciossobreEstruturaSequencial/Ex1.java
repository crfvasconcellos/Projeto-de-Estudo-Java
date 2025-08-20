package ExerciciossobreEstruturaSequencial;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        int soma = num1 + num2;

        System.out.println("SOMA = "+ soma);


    }
}
