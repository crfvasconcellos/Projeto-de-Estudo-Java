package Interfaces.Contratos.Program;

import Interfaces.Contratos.Entities.Contract;
import Interfaces.Contratos.Entities.Installment;
import Interfaces.Contratos.Services.ContractService;
import Interfaces.Contratos.Services.OnlinePaymentService;
import Interfaces.Contratos.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainContratos {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre os dados de contrato: ");
        System.out.println("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Data (dd/mm/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(),fmt);
        System.out.println("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contract contract = new Contract(numero,data,valor);

        System.out.println("Número de parcelas: ");
        int qtdparcelas = sc.nextInt();



        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract,qtdparcelas);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }



    }
}
