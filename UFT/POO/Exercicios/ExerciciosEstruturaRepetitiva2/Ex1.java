package ExerciciosEstruturaRepetitiva2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resposta= 0;
        int senha = 2002;

        while (true){
            resposta = sc.nextInt();

            if (resposta==senha){
                System.out.println("Acesso Permitido");
                break;
            }
            else {
                System.out.println("Senha Invalida");
            }
        }

    }
}
