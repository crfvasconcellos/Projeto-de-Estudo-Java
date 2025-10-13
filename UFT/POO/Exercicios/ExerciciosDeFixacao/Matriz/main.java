package ExerciciosDeFixacao.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = sc.nextInt();


            }
        }

        System.out.println("Numero: ");
        int numerodesejado = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j]== numerodesejado){
                        System.out.printf("\nPosition: %d,%d: ",i,j);

                    if (j != 0){
                        System.out.printf("\nLeft: %d", matriz[i][j-1]);
                    }
                    if (j != n-1){
                        System.out.printf("\nRight: %d",matriz[i] [j+1]);
                    }
                    if (i != 0){
                        System.out.printf("\nUp: %d",matriz[i-1][j]);
                    }
                    if (i != m-1){
                        System.out.printf("\nDown: %d",matriz[i+1][j]);
                    }


                }
            }
        }

    }
}
