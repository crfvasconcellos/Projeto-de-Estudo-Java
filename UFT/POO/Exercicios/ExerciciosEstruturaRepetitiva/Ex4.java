package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora1 = sc.nextInt();
        int hora2 = sc.nextInt();

        int duracao = 0;

        if (hora1 > hora2){
            duracao = (24-hora1)+hora2;
            
        } 
        else if (hora1 == hora2) {
            duracao = 24;
            
        } else if (hora2 > hora1) {

            duracao = hora2 - hora1;

            
        }

        System.out.println("O JOGO DUROU "+ duracao + " Horas");
    }
}
