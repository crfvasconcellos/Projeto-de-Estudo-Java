package Polimorfismo.Program;

import Polimorfismo.Entities.Employee;
import Polimorfismo.Entities.OutsourceEmployee;

import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Número de Funcionários: ");
        int qtd = sc.nextInt();

        Employee[] employees = new Employee[qtd];

        for (int i = 0; i < qtd; i++) {

            System.out.printf("Trabalhador %dº --- ",i+1);
            System.out.println("Teceirizado? (y/n): ");
            sc.nextLine();
            String simoounao = sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorporhora = sc.nextDouble();

            if (simoounao.equals("y")) {

                System.out.println("Salário Bônus: ");
                double bonus = sc.nextDouble();
                employees[i] = new OutsourceEmployee(nome, horas, valorporhora, bonus);
            }
            else {
                employees[i] = new Employee(nome,horas,valorporhora);
            }

        }

        for (int i = 0; i < qtd; i++) {
            System.out.println(employees[i]);
        }



}
}
