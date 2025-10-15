package ExercicioWorker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class contrato {

    private Date data;
    private double valorPorHora;
    private int horas;


    public contrato(Date data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public double valorTotal(){
        return valorPorHora * horas;
    }


}
