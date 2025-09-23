package Prova1;

public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo=0;


    @Override
    public String toString() {
        return "\n---Dados da Conta---\n" + "Numero = " + numeroConta + "\n" +
                "Titular = " + titular +
                "\n" + "Saldo = " + saldo ;
    }

    public void depositar(double valorDepositado){
        this.saldo = this.saldo + valorDepositado;
    }


    public void sacar(double valorSacado){
        if (valorSacado!= 0){
            this.saldo = this.saldo - (valorSacado+5);
        }
    }

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(depositoInicial);
    }
}
