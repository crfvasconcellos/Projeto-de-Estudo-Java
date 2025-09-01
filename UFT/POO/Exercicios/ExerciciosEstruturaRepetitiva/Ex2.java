package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 1 | numero % 2 == -1){
            System.out.println("Impar");

        }
        else {
            System.out.println("Par");
        }
    }
}
