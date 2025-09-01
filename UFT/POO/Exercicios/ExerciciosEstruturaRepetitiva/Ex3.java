package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int maior,menor;

        if (num1 >= num2){
            maior = num1;
            menor = num2;
        }
        else {
            maior = num2;
            menor = num1;
        }


        if (maior % menor == 0){
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

    }
}
