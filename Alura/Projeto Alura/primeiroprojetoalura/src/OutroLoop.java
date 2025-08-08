import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);


        double medavali = 0;
        double nota =0;
        int contador = 0;

        while (true){
            int resposta = 0;
            System.out.println("Diga sua avaliação para o filme de 0 à 10: ");
            nota = leitura.nextDouble();
            medavali = nota + medavali ;
            contador++;
            System.out.println("Deseja parar? \n  (1)- Sim \n (2) - Não \n R: ");
            resposta = leitura.nextInt();

            if (resposta == 1){
                break;
            }

        }

        System.out.println("Média de avaliações = " + medavali/contador);
    }
}
