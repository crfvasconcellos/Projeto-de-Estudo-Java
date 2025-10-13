package ExerciciosDeFixacao.Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int qtd = sc.nextInt();

        Funcionarios[] funcionarios = new Funcionarios[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.printf("\nEmplyoee #%d:",i+1);
            System.out.println("\nId: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salary: ");
            float salary = sc.nextFloat();

            funcionarios[i] = new Funcionarios(id,nome,salary);

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int iddoaumento = sc.nextInt();

        int existe = 0;
        for (int i = 0; i < qtd; i++) {
            if (iddoaumento == funcionarios[i].getId()){
                existe = 1;
            }
        }


        if (existe == 0){
            System.out.println("This id does not exist!");
        }
        else{

            System.out.println("Enter the percentage: ");
            float porcentagem = sc.nextFloat();

            for (int i = 0; i < qtd; i++) {

                if (funcionarios[i].getId()== iddoaumento)
                {
                    funcionarios[i].increase(porcentagem);
                }

            }

        }



        System.out.println("List of employees:\n");
        for (int i = 0; i < qtd; i++) {
            System.out.println(funcionarios[i]);
        }



    }
}
