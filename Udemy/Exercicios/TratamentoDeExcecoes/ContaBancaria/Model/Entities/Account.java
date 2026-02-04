package TratamentoDeExcecoes.ContaBancaria.Model.Entities;

import TratamentoDeExcecoes.ContaBancaria.Model.Exceptions.UpperWithDrawException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;

    }

    public void withdraw(double amount) throws UpperWithDrawException {

        if (amount > this.balance){
            throw new UpperWithDrawException("O Valor solicitado foi maior que o presente na conta ");
        }
        if (amount > withdrawLimit){
            throw  new UpperWithDrawException("O Valor solicitado foi maior que o limite disponível para saque ");
        }

        this.balance = this.balance - amount;
        System.out.println("Novo saldo: " + this.balance);



    }


}
