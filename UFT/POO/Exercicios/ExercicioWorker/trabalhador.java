package ExercicioWorker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class trabalhador {

    private String nome;
    private trabalhadorLevel level;
    private double salarioBase;

    private List<contrato> contratos = new ArrayList<>();

    public trabalhador(String nome, trabalhadorLevel level, double salarioBase) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public trabalhadorLevel getLevel() {
        return level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    protected void adicionarContrato(contrato contract){
        contratos.add(contract);
    }

    public void enterContrato(Date data, double valorPorHora, int horas){

        contrato contract = new contrato(data,valorPorHora,horas);
        this.adicionarContrato(contract);

    }

    public void removerContrato(contrato contract){
        contratos.remove(contract);
    }

    public double renda(int ano, int mes){
        double soma = salarioBase;

        Calendar cal = Calendar.getInstance();

        for (int i = 0; i < contratos.size(); i++) {
            contrato c = contratos.get(i);
            cal.setTime(c.getData());
            if (cal.get(Calendar.YEAR) == ano && cal.get(Calendar.MONTH) == mes){
                soma = soma + c.valorTotal();
            }

        }

        return soma;

    }

}
