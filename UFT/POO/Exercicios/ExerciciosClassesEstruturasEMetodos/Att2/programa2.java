package ExerciciosClassesEstruturasEMetodos.Att2;

import java.util.Locale;
import java.util.Scanner;

public class programa2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();


        System.out.print("Naome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        emp.salario = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.imposto= sc.nextDouble();
        System.out.println();
        System.out.println("Funcionario : " + emp);
        System.out.println();
        System.out.print("Em quantos % aumentar o salario? ");
        double percentage = sc.nextDouble();
        emp.aumento(percentage);
        System.out.println();
        System.out.println("Dados Atualizados: " + emp);

    }
}
