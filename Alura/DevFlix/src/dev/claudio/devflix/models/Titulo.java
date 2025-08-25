package dev.claudio.devflix.models;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacoes;
    private int totalDeAvaliacao;
    private int Duracao;


    public int getTotalDeAvaliacao(){
        return  totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setDuracao(int duracao) {
        this.Duracao = duracao;
    }

    public void exibirFicha(){
        System.out.println("\nNome : "+nome);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Duração: "+getDuracao()+" min");
    }

    public void avalia(double nota){
        avaliacoes = avaliacoes + nota;
        totalDeAvaliacao++;
    }

    public double obtemMedia(){
        return avaliacoes/totalDeAvaliacao;
    }

    public int getDuracao() {
        return Duracao;
    }
}
