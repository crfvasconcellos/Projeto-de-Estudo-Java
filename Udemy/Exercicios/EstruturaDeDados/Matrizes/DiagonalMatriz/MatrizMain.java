package EstruturaDeDados.Matrizes.DiagonalMatriz;

import java.util.Scanner;

public class MatrizMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o índice da matriz: ");
        int indice = sc.nextInt();
        int numneg=0;

        int [] [] numeros = new int[indice][indice];

        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice; j++) {

                System.out.println("Digite: ");
                numeros[i][j] = sc.nextInt();

                if (numeros[i][j]<0){
                    numneg++;
                }

            }
        }

        System.out.println("\nMain Diagonal: ");

        for (int i = 0; i < indice; i++) {

            System.out.printf("%d ",numeros[i][i]);

        }

        System.out.printf("\nNumeros negativos: %d ",numneg);







    }
}
