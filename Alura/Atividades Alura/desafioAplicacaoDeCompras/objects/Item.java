package objects;

public class Item implements Comparable<Item>{

    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }


    @Override
    public int compareTo(Item o) {
        if (o.getValor()> this.valor){

            return 1;

        } else if (this.valor>o.getValor()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
