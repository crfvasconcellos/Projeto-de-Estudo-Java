package ExerciciossobreEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int numerof = leitor.nextInt();
        int horast = leitor.nextInt();
        double valorPorH = leitor.nextDouble();

        double salario = (double) horast * valorPorH;

        System.out.printf("\nNUMBER = %d\nSALARY = U$ %.2f",numerof,salario);


    }
}
