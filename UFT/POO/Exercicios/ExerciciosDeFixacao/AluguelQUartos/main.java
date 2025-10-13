package ExerciciosDeFixacao.AluguelQUartos;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Quartos[] quartos = new Quartos[10];
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rooms will be rented? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();


            quartos[room-1] = new Quartos(nome,email,room);

        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i+1 + ": " + quartos[i]);
            }
        }

        sc.close();


    }
}
