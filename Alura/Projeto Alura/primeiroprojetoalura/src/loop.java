import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        double medavali = 0;
        double nota =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme de 0 à 10: ");
            nota = leitura.nextDouble();
            medavali = nota + medavali ;
        }

        System.out.println("Média de avaliações = " + medavali/3);

    }
}
