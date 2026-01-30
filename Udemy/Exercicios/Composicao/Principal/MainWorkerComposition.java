package Composicao.Principal;

import Composicao.HourContract;
import Composicao.Worker;
import Composicao.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainWorkerComposition {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Departamento: ");
        String departamento = sc.nextLine();

        System.out.println("COLOQUE OS DADOS DO TRABALHADOR ----");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Level: ");
        String level = sc.nextLine();
        System.out.println("Salário Base: ");
        double salariobase = sc.nextDouble();

        Worker worker = new Worker(nome,WorkerLevel.valueOf(level),salariobase,departamento);

        System.out.println("Quantos Contratos para esse trabalhador? ");
        int numerocontratos = sc.nextInt();

        for (int i = 0; i < numerocontratos; i++) {
            System.out.printf("\nColoque o %dº Contrato ===\n",i+1);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Data (DD/MM/YYYY): ");
            sc.nextLine();
            String dataS = sc.nextLine();
            Date data = sdf.parse(dataS);

            System.out.println("Valor por hora: ");
            double  valor = sc.nextDouble();
            System.out.println("Duração (horas) : ");
            int horas = sc.nextInt();

            HourContract contrato = new HourContract(data,valor,horas);
            worker.addContract(contrato);

        }

        System.out.println("Coloque o Mês e o Ano para saber o salário (MM/YYYY): ");
        sc.nextLine();
        String datadoSalarioSTRING = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Date datadoSalario = sdf.parse(datadoSalarioSTRING);

        System.out.printf("\nNome: %s",worker.getName());
        System.out.printf("\nDepartamento: %s ",worker.getDepartment().getName());
        System.out.printf("\nSalário de %s: %.2f ",datadoSalarioSTRING,worker.income(datadoSalario.getYear()+1900,datadoSalario.getMonth()+1));



    }
}
