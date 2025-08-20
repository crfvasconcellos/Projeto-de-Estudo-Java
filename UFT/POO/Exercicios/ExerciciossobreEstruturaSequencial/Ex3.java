package ExerciciossobreEstruturaSequencial;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner leitor = new Scanner(System.in);

        int a,b,c,d;

        a= leitor.nextInt();
        b= leitor.nextInt();
        c= leitor.nextInt();
        d= leitor.nextInt();

        System.out.printf("\nDIFERENÇA = %d",(a*b-c*d));

    }
}
