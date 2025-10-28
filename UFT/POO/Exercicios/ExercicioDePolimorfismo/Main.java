package ExercicioDePolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (tipo == 'i' || tipo == 'I') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int funcionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        System.out.println("\nTAXES PAID:");
        double total = 0.0;
        for (Contribuinte c : lista) {
            double imposto = c.calcularImposto();
            System.out.printf("%s: $ %.2f%n", c.getNome(), imposto);
            total += imposto;
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f%n", total);

        sc.close();


    }
}
