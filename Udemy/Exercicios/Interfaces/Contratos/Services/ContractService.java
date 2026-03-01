package Interfaces.Contratos.Services;

import Interfaces.Contratos.Entities.Contract;
import Interfaces.Contratos.Entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;


        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicQuota,i);
            double fee = paymentService.paymentFee(interest+basicQuota);
            double total = basicQuota + interest + fee;

            Installment installment = new Installment(dueDate, total);

            contract.getInstallments().add(installment);

        }

    }


}
