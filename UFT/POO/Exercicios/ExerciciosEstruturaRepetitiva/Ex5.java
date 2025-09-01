package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        double preco =0;

        for (int i = 0; i < qtd; i++) {

            switch (codigo){
                case 1:
                    preco = qtd * 4;
                    break;
                case 2:
                    preco = qtd * 4.5;
                    break;
                case 3:
                    preco = qtd * 5;
                    break;
                case 4:
                    preco = qtd * 2;
                    break;
                case 5:
                    preco = qtd * 1.5;
                    break;
            }
        }

        System.out.printf("\nTotal: R$ %.2f ",preco);

    }
}
