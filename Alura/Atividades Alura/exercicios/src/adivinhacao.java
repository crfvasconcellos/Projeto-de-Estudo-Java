import java.util.Random;
import java.util.Scanner;

public class adivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Tentativa "+ (i+1) +" de 5");
            System.out.println("Chute um número: ");
            int resposta = leitor.nextInt();

            if (resposta == num){
                System.out.println("Você Acertou!!");
                break;

            } else if (resposta<num) {
                System.out.println("Ele é maior!");

            } else if (resposta>num) {
                System.out.println("Ele é menor!");

            }
        }

        System.out.println("Jogo Finalizado! \n O número era "+num);

    }
}