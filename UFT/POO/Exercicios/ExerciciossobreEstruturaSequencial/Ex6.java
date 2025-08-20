package ExerciciossobreEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double a,b,c;

        a = leitor.nextDouble();
        b= leitor.nextDouble();
        c= leitor.nextDouble();

        double triangulo,circulo,trapezio,quadrado,retangulo;

        triangulo = (a*c)/2;
        circulo = (c*c) * 3.14159;
        trapezio= ((a+b)*c)/2;
        quadrado= b*b;
        retangulo= a*b;

        System.out.printf("\nTRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n",triangulo,circulo,trapezio,quadrado,retangulo);




    }
}
