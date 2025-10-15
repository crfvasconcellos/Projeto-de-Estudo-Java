package ExercicioWorker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Departamento
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        departamento departament = new departamento(departmentName);

        // Dados do trabalhador
        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level (JUNIOR, MID_LEVEL, SENIOR): ");
        trabalhadorLevel workerLevel = trabalhadorLevel.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        trabalhador trabalhador = new trabalhador(workerName, workerLevel, baseSalary);

        // Contratos
        System.out.print("How many contracts to this worker? ");
        int numContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContracts; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.nextLine());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            trabalhador.enterContrato(contractDate, valuePerHour, hours);
        }

        // Cálculo de renda
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String targetMonthYear = sc.nextLine();

        String[] parts = targetMonthYear.split("/");
        int targetMonth = Integer.parseInt(parts[0]) - 1; // Calendar.MONTH começa do 0
        int targetYear = Integer.parseInt(parts[1]);

        double totalIncome = trabalhador.renda(targetYear, targetMonth);

        // Resultado
        System.out.printf("\nName: %s\n", trabalhador.getNome());
        System.out.printf("Department: %s\n", departament.getNome());
        System.out.printf("Income for %s: %.2f\n", targetMonthYear, totalIncome);

        sc.close();
    }
}
