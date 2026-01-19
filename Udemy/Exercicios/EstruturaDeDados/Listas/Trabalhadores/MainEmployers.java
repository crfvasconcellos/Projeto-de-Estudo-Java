package EstruturaDeDados.Listas.Trabalhadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employers> employers = new ArrayList<>();

        System.out.println("Quantos trabalhadores deseja-se cadastrar? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.printf("\nEmployee #%d\n",i+1);
            System.out.println("id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            employers.add(new Employers(name,id,salario));

        }

        System.out.println("Coloque o id do trabalhador que ganhará aumento: ");
        int idaumento = sc.nextInt();
        Employers trabalhadordomes = null;

        for(Employers employer : employers){

            if (employer.getId() == idaumento){
                trabalhadordomes = employer;
                break;

            }

        }

        if (trabalhadordomes == null){
            System.out.println("O id dado não existe!");
        }
        else {
            System.out.println("Quantos % vai aumentar o salário? ");
            double porcentage = sc.nextDouble();
            double novosalario;
            novosalario = trabalhadordomes.getSalary() + trabalhadordomes.getSalary() * porcentage/100;
            trabalhadordomes.setSalary(novosalario);
        }

        System.out.println("Lista de Trabalhadores --- ");

        for (Employers employer: employers){

            System.out.printf("\n%s",employer);
        }

    sc.close();


    }
}
