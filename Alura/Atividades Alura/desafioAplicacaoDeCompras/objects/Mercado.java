package objects;

import java.util.ArrayList;

public class Mercado {

    private double saldo;
    private ArrayList<Item> comprados = new ArrayList<>();
    private int qtdItens = 0;

    public int getQtdItens() {
        return qtdItens;
    }

    public double getSaldo() {
        return saldo;
    }

    public Mercado(double saldo) {
        this.saldo = saldo;
    }


    private int DescontarCartao (double valor){

        if (this.saldo< valor){
            return 1;
        }
        else{
            this.saldo = this.saldo - valor;
            return 0;
        }


    }


    public ArrayList<Item> getComprados() {
        return comprados;
    }


    public int adicionarItem(String nome, double valor){

        int foi = DescontarCartao(valor);

        if (foi == 1){
            return foi;
        }
        else {

            Item itemNovo = new Item(nome,valor);
            comprados.add(itemNovo);
            qtdItens++;

            return foi;
        }

    }

    public void getItemDeComprados(int i){

        System.out.printf("\n%s - R$%.2f \n",comprados.get(i).getNome(), comprados.get(i).getValor());

    }

    @Override
    public String toString() {
        return "mercado{" +
                "comprados=" + comprados +
                '}';
    }
}
