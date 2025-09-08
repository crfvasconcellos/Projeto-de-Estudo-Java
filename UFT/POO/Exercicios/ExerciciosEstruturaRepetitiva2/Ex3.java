package ExerciciosEstruturaRepetitiva2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = 0;

        int alcool, disel, gasolina;
        
        alcool = disel = gasolina = 0;
        
        while (true){
            num = sc.nextInt();
            if (num == 1){
                alcool++;
            } else if (num==2) {
                gasolina++;
            } else if (num==3) {
                disel++;
            } else if (num==4) {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("\n Alcool : %d \n Gasolina: %d \n Disel: %d \n",
                alcool,gasolina,disel);
    }
}
